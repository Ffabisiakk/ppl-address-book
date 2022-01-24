package pl.ppl.addressbook.contact.entry;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.ppl.addressbook.BaseEntity;
import pl.ppl.addressbook.contact.Contact;
import pl.ppl.addressbook.contact.ContactType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@NoArgsConstructor
public class Email extends BaseEntity<Long> {

    @javax.validation.constraints.Email
    private String address;
    private ContactType type;
    private String description;

    @ManyToOne()
    @Setter
    private Contact contact;

    public Email(String address, ContactType type, String description) {
        this.address = address;
        this.type = type;
        this.description = description;
    }

    public Email update(Email email) {
        this.address = email.address;
        this.type = email.type;
        this.description = email.description;
        return this;
    }

}
