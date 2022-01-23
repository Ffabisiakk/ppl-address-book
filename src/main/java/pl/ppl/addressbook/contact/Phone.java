package pl.ppl.addressbook.contact;

import pl.ppl.addressbook.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Phone extends BaseEntity<Long> {

    private String number;
    private ContactType type;

    @ManyToOne()
    private Contact contact;
}
