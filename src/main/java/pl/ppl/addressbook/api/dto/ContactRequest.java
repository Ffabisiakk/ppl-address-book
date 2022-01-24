package pl.ppl.addressbook.api.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import pl.ppl.addressbook.contact.ContactInfo;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class ContactRequest {

    @NotBlank(message = "Name is mandatory")
    private String name;
    private String note;
    private String group;

    public ContactInfo toContactInfo() {
        return new ContactInfo(this.name, this.note, this.group);
    }
}
