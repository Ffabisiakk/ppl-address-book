package pl.ppl.addressbook.contact;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.ContactRequest;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContactSaveServiceTest {

    @InjectMocks
    ContactSaveServiceImpl service;

    @Mock
    ContactRepository repository;

    @Test
    public void shouldCreateEmptyContact() {
//        Given
        ContactRequest request = getContactRequest(1);

        Contact contact = new Contact();
        contact.setContactInfo(request.toContactInfo());

//        When
        when(repository.save(any())).thenReturn(contact);

        ContactDto response = service.create(request);

//        Then
        assertThat(response.getName()).isEqualTo(request.getName());
        assertThat(response.getNote()).isEqualTo(request.getNote());
        assertThat(response.getGroup()).isEqualTo(request.getGroup());
        assertThat(response.getEmails().size()).isEqualTo(0);
        assertThat(response.getPhones().size()).isEqualTo(0);
        assertThat(response.getSocials().size()).isEqualTo(0);
    }

    @Test
    public void shouldUpdateContact() {
//        Given
        ContactRequest request = getContactRequest(2);

        Contact contact = new Contact();
        ContactInfo contactInfo = getContactRequest(1).toContactInfo();
        contact.setId(1L);
        contact.setContactInfo(contactInfo);

        Contact contactUpd = new Contact();
        ContactInfo contactInfoUpd = request.toContactInfo();
        contactUpd.setId(1L);
        contactUpd.setContactInfo(contactInfoUpd);

//        When
        when(repository.findById(1L)).thenReturn(Optional.of(contact));
        when(repository.save(any())).thenReturn(contactUpd);

        ContactDto response = service.update(1L, request);

//        Then
        assertThat(response.getId()).isEqualTo(1L);
        assertThat(response.getName()).isEqualTo(request.getName());
        assertThat(response.getNote()).isEqualTo(request.getNote());
        assertThat(response.getGroup()).isEqualTo(request.getGroup());
        assertThat(response.getEmails().size()).isEqualTo(0);
        assertThat(response.getPhones().size()).isEqualTo(0);
        assertThat(response.getSocials().size()).isEqualTo(0);
    }

    @Test
    public void shouldNotUpdateNoExistingContact() {
//        Given
        ContactRequest request = getContactRequest(2);

//        When
        when(repository.findById(1L)).thenReturn(Optional.empty());

//        Then
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy( () -> {
            service.update(1L, request);
        });
    }

    private ContactRequest getContactRequest(int number) {
        return ContactRequest.builder()
                .name("name " + number)
                .group("group " + number)
                .note("note " + number)
                .build();
    }
}
