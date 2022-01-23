package pl.ppl.addressbook.contact.entry;

import pl.ppl.addressbook.Mapper;
import pl.ppl.addressbook.api.dto.SocialDto;

public class SocialMapper extends Mapper<Social, SocialDto> {

    @Override
    public SocialDto toDto(Social social) {
        return SocialDto.builder()
                .id(social.getId())
                .site(social.getSite())
                .link(social.getLink())
                .description(social.getDescription())
                .build();
    }

}
