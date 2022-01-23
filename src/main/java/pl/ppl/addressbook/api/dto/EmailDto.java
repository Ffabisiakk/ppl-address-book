package pl.ppl.addressbook.api.dto;

import lombok.Data;
import pl.ppl.addressbook.contact.ContactType;

@Data
public class EmailDto {
    private String address;
    private ContactType type;
    private String description;
}
