package pl.ppl.addressbook.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class ContactInfo {

    @NotBlank
    private String name;
    private String note;
    @Column(name = "contact_group")
    private String group;
}
