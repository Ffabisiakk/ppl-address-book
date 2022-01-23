package pl.ppl.addressbook.contact;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class ContactInfo {
    private String name;
    private String note;
    @Column(name = "contact_group")
    private String group;
}
