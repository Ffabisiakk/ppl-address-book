package pl.ppl.addressbook.api.dto;

import lombok.Builder;
import lombok.Data;
import pl.ppl.addressbook.contact.ContactType;
import pl.ppl.addressbook.contact.entry.Email;

@Data
@Builder
public class EmailEntryRequest {
    @javax.validation.constraints.Email
    private String address;
    private ContactType type;
    private String description;

    public Email toEmail() {
        return new Email(this.address, this.type, this.description);
    }
}
