package pl.ppl.addressbook.api.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ContactDto {

    private String name;
    private String note;
    private String group;
    private Set<EmailDto> emails;
    private Set<PhoneDto> phones;
    private Set<SocialDto> socials;
}
