package pl.ppl.addressbook.contact.social;

import org.mapstruct.Mapper;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.SocialDto;
import pl.ppl.addressbook.contact.Contact;

import java.util.List;

@Mapper
public interface SocialMapper {

    SocialDto toDto(Social social);
    List<SocialDto> toDtoList(List<Social> list);
}
