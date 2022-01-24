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
public class Phone extends BaseEntity<Long> {

    private String number;
    private ContactType type;

    @ManyToOne()
    @Setter
    private Contact contact;

    public Phone(String number, ContactType type) {
        this.number = number;
        this.type = type;
    }

    public Phone update(Phone phone) {
        this.number = phone.getNumber();
        this.type = phone.getType();
        return this;
    }
}
