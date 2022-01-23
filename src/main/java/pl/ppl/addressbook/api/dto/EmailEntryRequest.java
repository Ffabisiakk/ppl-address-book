package pl.ppl.addressbook.api.dto;

import lombok.Data;
import pl.ppl.addressbook.contact.ContactType;
import pl.ppl.addressbook.contact.entry.Email;

@Data
public class EmailEntryRequest {
    private String address;
    private ContactType type;
    private String description;

    public Email toEmail() {
        return new Email(this.address, this.type, this.description);
    }
}
