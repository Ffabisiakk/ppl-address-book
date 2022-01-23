package pl.ppl.addressbook.contact.phone;

import pl.ppl.addressbook.BaseEntity;
import pl.ppl.addressbook.contact.Contact;
import pl.ppl.addressbook.contact.ContactType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Phone extends BaseEntity<Long> {

    private String number;
    private ContactType type;

    @ManyToOne()
    private Contact contact;
}
