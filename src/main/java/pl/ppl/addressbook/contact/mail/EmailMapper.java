package pl.ppl.addressbook.contact.mail;

import org.mapstruct.Mapper;
import pl.ppl.addressbook.api.dto.EmailDto;

import java.util.List;

@Mapper
public interface EmailMapper {

    EmailDto toDto(Email email);
    List<EmailDto> toDtoList(List<Email> list);
}
