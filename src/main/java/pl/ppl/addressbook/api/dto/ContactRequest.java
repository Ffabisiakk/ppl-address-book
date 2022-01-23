package pl.ppl.addressbook.api.dto;

import lombok.Data;
import pl.ppl.addressbook.contact.ContactInfo;

@Data
public class ContactRequest {
    private String name;
    private String note;
    private String group;

    public ContactInfo toContactInfo() {
        return new ContactInfo(this.name, this.note, this.group);
    }
}
