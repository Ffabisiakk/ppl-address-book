package pl.ppl.addressbook.api;

import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.ContactRequest;

public interface ContactSaveService {
    ContactDto create(ContactRequest request);
    ContactDto update(Long id, ContactRequest request);
}
