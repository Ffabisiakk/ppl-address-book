package pl.ppl.addressbook.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SocialDto {

    private Long id;
    private String site;
    private String link;
    private String description;


}
