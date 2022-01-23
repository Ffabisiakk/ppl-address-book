package pl.ppl.addressbook.api.dto;

import pl.ppl.addressbook.contact.ContactType;
import pl.ppl.addressbook.contact.entry.Email;
import pl.ppl.addressbook.contact.entry.Phone;

public class PhoneEntryRequest {
    private String number;
    private ContactType type;

    public Phone toPhone() {
        return new Phone(this.number, this.type);
    }
}
