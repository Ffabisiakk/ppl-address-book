package pl.ppl.addressbook.contact;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ppl.addressbook.api.ContactFindService;
import pl.ppl.addressbook.api.dto.ContactDto;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactFindServiceImpl implements ContactFindService {

    private final ContactRepository repository;

    @Override
    public List<ContactDto> getAll() {
        return new ContactMapper().toDtoList(repository.findAll());
    }

    @Override
    public ContactDto getByContactName(String name) {
        Optional<Contact> contact = repository.getByContactInfo_Name(name);
        return contact.map(new ContactMapper()::toDto).orElseThrow();
    }

    @Override
    public ContactDto getById(Long id) {
        Optional<Contact> contact = repository.findById(id);
        return contact.map(new ContactMapper()::toDto).orElseThrow();
    }
}
