package pl.ppl.addressbook.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ContactDto {

    private Long id;
    private String name;
    private String note;
    private String group;
    private List<EmailDto> emails;
    private List<PhoneDto> phones;
    private List<SocialDto> socials;
}
