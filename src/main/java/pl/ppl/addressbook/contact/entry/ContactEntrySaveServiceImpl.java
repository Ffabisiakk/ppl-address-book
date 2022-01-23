package pl.ppl.addressbook.contact.entry;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ppl.addressbook.api.ContactEntrySaveService;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.EmailEntryRequest;
import pl.ppl.addressbook.api.dto.PhoneEntryRequest;
import pl.ppl.addressbook.api.dto.SocialEntryRequest;
import pl.ppl.addressbook.contact.Contact;
import pl.ppl.addressbook.contact.ContactMapper;
import pl.ppl.addressbook.contact.ContactRepository;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactEntrySaveServiceImpl implements ContactEntrySaveService {

    private final ContactRepository repository;

    @Override
    public ContactDto createMailEntry(Long contactId, EmailEntryRequest request) {
        Optional<Contact> contact = repository.findById(contactId);
        return contact.map(c -> {
            c.getEmails().add(request.toEmail());
            repository.save(c);
            return new ContactMapper().toDto(c);
        }).orElseThrow();
    }

    @Override
    public ContactDto updateMailEntry(Long contactId, Long emailId, EmailEntryRequest request) {
        Optional<Contact> contact = repository.findById(contactId);
        return contact.map(c -> {
            Optional<Email> email = c.getEmails().stream()
                    .filter(e -> Objects.equals(e.getId(), emailId))
                    .findFirst();

            email.map(e -> e.update(request.toEmail())).orElseThrow();

            return new ContactMapper().toDto(repository.save(c));
        }).orElseThrow();
    }

    @Override
    public ContactDto createPhoneEntry(Long contactId, PhoneEntryRequest request) {
        Optional<Contact> contact = repository.findById(contactId);
        return contact.map(c -> {
            c.getPhones().add(request.toPhone());
            repository.save(c);
            return new ContactMapper().toDto(c);
        }).orElseThrow();
    }

    @Override
    public ContactDto updatePhoneEntry(Long contactId, Long phoneId, PhoneEntryRequest request) {
        Optional<Contact> contact = repository.findById(contactId);
        return contact.map(c -> {
            Optional<Phone> phone = c.getPhones().stream()
                    .filter(e -> Objects.equals(e.getId(), phoneId))
                    .findFirst();

            phone.map(p -> p.update(request.toPhone())).orElseThrow();

            return new ContactMapper().toDto(repository.save(c));
        }).orElseThrow();
    }

    @Override
    public ContactDto createSocialEntry(Long contactId, SocialEntryRequest request) {
        Optional<Contact> contact = repository.findById(contactId);
        return contact.map(c -> {
            c.getSocials().add(request.toSocial());
            repository.save(c);
            return new ContactMapper().toDto(c);
        }).orElseThrow();
    }

    @Override
    public ContactDto updateSocialEntry(Long contactId, Long socialId, SocialEntryRequest request) {
        Optional<Contact> contact = repository.findById(contactId);
        return contact.map(c -> {
            Optional<Social> social = c.getSocials().stream()
                    .filter(e -> Objects.equals(e.getId(), socialId))
                    .findFirst();

            social.map(s -> s.update(request.toSocial())).orElseThrow();

            return new ContactMapper().toDto(repository.save(c));
        }).orElseThrow();
    }
}
