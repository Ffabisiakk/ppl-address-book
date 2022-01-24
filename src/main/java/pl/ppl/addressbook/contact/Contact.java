package pl.ppl.addressbook.contact;

import lombok.*;
import pl.ppl.addressbook.BaseEntity;
import pl.ppl.addressbook.contact.entry.Email;
import pl.ppl.addressbook.contact.entry.Phone;
import pl.ppl.addressbook.contact.entry.Social;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
@Getter
@NoArgsConstructor
public class Contact extends BaseEntity<Long> {

    @Embedded
    @Setter
    private ContactInfo contactInfo;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Email> emails = new ArrayList<>();

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Phone> phones = new ArrayList<>();

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Social> socials = new ArrayList<>();

    public void addEmail(Email email) {
        this.emails.add(email);
        email.setContact(this);
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
        phone.setContact(this);
    }

    public void addSocial(Social social) {
        this.socials.add(social);
        social.setContact(this);
    }
}
