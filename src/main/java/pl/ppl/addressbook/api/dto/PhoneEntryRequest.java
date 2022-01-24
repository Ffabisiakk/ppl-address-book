package pl.ppl.addressbook.api.dto;

import pl.ppl.addressbook.contact.ContactType;
import pl.ppl.addressbook.contact.entry.Phone;

import javax.validation.constraints.Pattern;

public class PhoneEntryRequest {

    @Pattern(regexp = "^\\+\\d{1,3}( )?(\\d{3}[ ]?){2}\\d{3}$")
    private String number;
    private ContactType type;

    public Phone toPhone() {
        return new Phone(this.number, this.type);
    }
}
