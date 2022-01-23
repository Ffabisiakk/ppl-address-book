package pl.ppl.addressbook.contact;

import lombok.*;
import pl.ppl.addressbook.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Contact extends BaseEntity<Long> {

    @Embedded
    private ContactInfo contactInfo;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<Email> emails;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<Phone> phones;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<Social> socials;
}
