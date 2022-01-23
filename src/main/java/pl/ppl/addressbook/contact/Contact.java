package pl.ppl.addressbook.contact;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.ppl.addressbook.BaseEntity;
import pl.ppl.addressbook.contact.entry.Email;
import pl.ppl.addressbook.contact.entry.Phone;
import pl.ppl.addressbook.contact.entry.Social;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Contact extends BaseEntity<Long> {

    @Embedded
    @Setter
    private ContactInfo contactInfo;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Email> emails = new ArrayList<>();

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Phone> phones = new ArrayList<>();

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Social> socials = new ArrayList<>();

}
