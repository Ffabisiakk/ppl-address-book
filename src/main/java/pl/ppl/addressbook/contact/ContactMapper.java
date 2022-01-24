package pl.ppl.addressbook.contact;

import pl.ppl.addressbook.Mapper;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.contact.entry.EmailMapper;
import pl.ppl.addressbook.contact.entry.PhoneMapper;
import pl.ppl.addressbook.contact.entry.SocialMapper;

public class ContactMapper extends Mapper<Contact, ContactDto> {

    @Override
    public ContactDto toDto(Contact contact) {
        ContactInfo contactInfo = contact.getContactInfo();
        return ContactDto.builder()
                .id(contact.getId())
                .name(contactInfo.getName())
                .group(contactInfo.getGroup())
                .note(contactInfo.getNote())
                .emails(new EmailMapper().toDtoList(contact.getEmails()))
                .phones(new PhoneMapper().toDtoList(contact.getPhones()))
                .socials(new SocialMapper().toDtoList(contact.getSocials()))
                .build();
    }
}
