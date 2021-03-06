package pl.ppl.addressbook.api.dto;

import lombok.Builder;
import lombok.Data;
import pl.ppl.addressbook.contact.ContactType;

@Data
@Builder
public class EmailDto {

    private Long id;
    private String address;
    private ContactType type;
    private String description;
}
