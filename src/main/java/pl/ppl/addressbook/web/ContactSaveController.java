package pl.ppl.addressbook.web;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.ppl.addressbook.api.ContactSaveService;
import pl.ppl.addressbook.api.dto.ContactRequest;
import pl.ppl.addressbook.api.dto.ContactDto;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ContactSaveController {

    private final ContactSaveService service;

    @PostMapping("/contact")
    public ContactDto createEmptyContact(@Valid @RequestBody ContactRequest request) {
        return this.service.create(request);
    }

    @PutMapping("/contact/{id}")
    public ContactDto updateContact(@PathVariable Long id, @RequestBody ContactRequest request) {
        return this.service.update(id, request);
    }
}
