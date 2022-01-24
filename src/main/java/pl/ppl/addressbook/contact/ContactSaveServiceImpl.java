package pl.ppl.addressbook.contact;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ppl.addressbook.api.ContactSaveService;
import pl.ppl.addressbook.api.dto.ContactRequest;
import pl.ppl.addressbook.api.dto.ContactDto;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactSaveServiceImpl implements ContactSaveService {

    private final ContactRepository repository;

    @Override
    public ContactDto create(ContactRequest request) {
        Contact contact = new Contact();
        contact.setContactInfo(request.toContactInfo());
        return new ContactMapper().toDto(repository.save(contact));
    }

    @Override
    public ContactDto update(Long id, ContactRequest request) {
        Optional<Contact> contact = repository.findById(id);
        return contact.map(c -> {
            c.setContactInfo(request.toContactInfo());
            return new ContactMapper().toDto(repository.save(c));
        }).orElseThrow(() -> new NoSuchElementException("No contact with given id"));
    }
}
