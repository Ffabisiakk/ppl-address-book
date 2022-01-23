package pl.ppl.addressbook.api.dto;

import lombok.Data;
import pl.ppl.addressbook.contact.ContactType;

@Data
public class PhoneDto {
    private String number;
    private ContactType type;
}
