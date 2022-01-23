package pl.ppl.addressbook.api.dto;

import pl.ppl.addressbook.contact.entry.Social;

public class SocialEntryRequest {

    private String site;
    private String link;
    private String description;

    public Social toSocial() {
        return new Social(this.site, this.link, this.description);
    }
}
