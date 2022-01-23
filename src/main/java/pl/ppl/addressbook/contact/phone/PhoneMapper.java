package pl.ppl.addressbook.contact.phone;

import org.mapstruct.Mapper;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.PhoneDto;
import pl.ppl.addressbook.contact.Contact;

import java.util.List;

@Mapper
public interface PhoneMapper {

    PhoneDto toDto(Phone phone);
    List<PhoneDto> toDtoList(List<Phone> list);
}
