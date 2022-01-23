package pl.ppl.addressbook.contact;

import pl.ppl.addressbook.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Social extends BaseEntity<Long> {

    private String site;
    private String link;
    private String description;

    @ManyToOne()
    private Contact contact;
}
