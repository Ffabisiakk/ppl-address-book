package pl.ppl.addressbook.contact;

import pl.ppl.addressbook.api.dto.EmailDto;
import pl.ppl.addressbook.api.dto.PhoneDto;
import pl.ppl.addressbook.api.dto.SocialDto;

import javax.persistence.Embeddable;
import java.util.Set;

@Embeddable
class ContactInfo {
    private String name;
    private String note;
    private String group;
}
