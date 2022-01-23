package pl.ppl.addressbook.contact;

import org.mapstruct.Mapper;
import pl.ppl.addressbook.api.dto.ContactDto;

import java.util.List;

@Mapper
public interface ContactMapper {

    ContactDto toDto(Contact contact);
    List<ContactDto> toDtoList(List<Contact> list);
}
