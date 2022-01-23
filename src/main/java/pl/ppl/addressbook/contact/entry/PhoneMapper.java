package pl.ppl.addressbook.contact.entry;

import pl.ppl.addressbook.Mapper;
import pl.ppl.addressbook.api.dto.PhoneDto;

public class PhoneMapper extends Mapper<Phone, PhoneDto> {

    @Override
    public PhoneDto toDto(Phone phone) {
        return PhoneDto.builder()
                .id(phone.getId())
                .number(phone.getNumber())
                .type(phone.getType())
                .build();
    }

}
