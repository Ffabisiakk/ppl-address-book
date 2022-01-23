package pl.ppl.addressbook.contact.entry;

import pl.ppl.addressbook.Mapper;
import pl.ppl.addressbook.api.dto.EmailDto;

public class EmailMapper extends Mapper<Email, EmailDto> {

    @Override
    public EmailDto toDto(Email email) {
        return EmailDto.builder()
                .id(email.getId())
                .address(email.getAddress())
                .description(email.getDescription())
                .type(email.getType())
                .build();
    }

}
