package pl.ppl.addressbook.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Embeddable
public class ContactInfo {
    private String name;
    private String note;
    @Column(name = "contact_group")
    private String group;
}
