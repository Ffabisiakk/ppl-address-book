package pl.ppl.addressbook.contact.entry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.ContactRequest;
import pl.ppl.addressbook.api.dto.EmailEntryRequest;
import pl.ppl.addressbook.contact.Contact;
import pl.ppl.addressbook.contact.ContactRepository;
import pl.ppl.addressbook.contact.ContactType;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContactEntrySaveServiceImplTest {

    @InjectMocks
    ContactEntrySaveServiceImpl service;

    @Mock
    ContactRepository repository;


    @Test
    public void shouldCreateEmailEntryToGivenContact() {
//        Given
        EmailEntryRequest request = getEmailEntryRequest(1);

        Contact contact = getContact();

        Contact contactUpd = getContact();
        Email email = request.toEmail();
        email.setId(1L);
        contactUpd.addEmail(email);

//        When
        when(repository.findById(any())).thenReturn(Optional.of(contact));
        when(repository.save(any())).thenReturn(contactUpd);

        ContactDto response = service.createMailEntry(1L, request);

//        Then
        assertThat(response.getEmails().size()).isEqualTo(1);
        assertThat(response.getPhones().size()).isEqualTo(0);
        assertThat(response.getSocials().size()).isEqualTo(0);
    }

    @Test
    public void shouldUpdateEmailEntryToGivenContact() {
//        Given
        EmailEntryRequest request = getEmailEntryRequest(1);
        EmailEntryRequest requestUpd = getEmailEntryRequest(2);

        Contact contact = getContact();
        Email email = request.toEmail();
        email.setId(1L);
        contact.addEmail(email);

        Contact contactUpd = getContact();
        Email emailUpd = requestUpd.toEmail();
        email.setId(1L);
        contactUpd.addEmail(emailUpd);

//        When
        when(repository.findById(any())).thenReturn(Optional.of(contact));
        when(repository.save(any())).thenReturn(contactUpd);

        ContactDto response = service.createMailEntry(1L, request);

//        Then
        assertThat(response.getEmails().size()).isEqualTo(1);
        assertThat(response.getPhones().size()).isEqualTo(0);
        assertThat(response.getSocials().size()).isEqualTo(0);
    }

    private EmailEntryRequest getEmailEntryRequest(int i) {
        return EmailEntryRequest.builder()
                .address("address " + i)
                .description("description" + i)
                .type(ContactType.PRIVATE)
                .build();
    }

    private Contact getContact() {
        Contact contact = new Contact();
        contact.setId(1L);
        contact.setContactInfo(getContactRequest().toContactInfo());
        return contact;
    }

    private ContactRequest getContactRequest() {
        return ContactRequest.builder()
                .name("name")
                .group("group")
                .note("note")
                .build();
    }
}
