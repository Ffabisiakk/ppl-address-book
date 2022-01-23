package pl.ppl.addressbook.contact;

import pl.ppl.addressbook.BaseEntity;

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
