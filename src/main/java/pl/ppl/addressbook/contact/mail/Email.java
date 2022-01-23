package pl.ppl.addressbook.contact.mail;

import pl.ppl.addressbook.BaseEntity;
import pl.ppl.addressbook.contact.Contact;
import pl.ppl.addressbook.contact.ContactType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Email extends BaseEntity<Long> {

    private String address;
    private ContactType type;
    private String description;

    @ManyToOne()
    private Contact contact;
}
