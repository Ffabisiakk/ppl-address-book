package pl.ppl.addressbook.api;

import pl.ppl.addressbook.api.dto.ContactDto;

import java.util.List;
import java.util.Optional;

public interface ContactFindService {
    List<ContactDto> getAll();
    Optional<ContactDto> getByContactName(String name);

}
