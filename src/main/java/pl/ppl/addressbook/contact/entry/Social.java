package pl.ppl.addressbook.contact.entry;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.ppl.addressbook.BaseEntity;
import pl.ppl.addressbook.contact.Contact;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@NoArgsConstructor
public class Social extends BaseEntity<Long> {

    private String site;
    private String link;
    private String description;

    @ManyToOne()
    @Setter
    private Contact contact;

    public Social(String site, String link, String description) {
        this.site = site;
        this.link = link;
        this.description = description;
    }

    public Social update(Social social) {
        this.site = social.getSite();
        this.link = social.getLink();
        this.description = social.getDescription();
        return this;
    }
}
