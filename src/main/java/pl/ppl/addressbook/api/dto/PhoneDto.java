package pl.ppl.addressbook.api.dto;

import lombok.Builder;
import lombok.Data;
import pl.ppl.addressbook.contact.ContactType;

@Data
@Builder
public class PhoneDto {

    private Long id;
    private String number;
    private ContactType type;
}
