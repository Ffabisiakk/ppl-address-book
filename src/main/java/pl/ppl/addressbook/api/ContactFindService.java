package pl.ppl.addressbook.api;

import pl.ppl.addressbook.api.dto.ContactDto;

import java.util.List;

public interface ContactFindService {
    List<ContactDto> getAll();
    ContactDto getById(Long id);
}
