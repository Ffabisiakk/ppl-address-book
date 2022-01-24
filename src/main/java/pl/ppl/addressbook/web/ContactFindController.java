package pl.ppl.addressbook.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.ppl.addressbook.api.ContactFindService;
import pl.ppl.addressbook.api.dto.ContactDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContactFindController {

    private final ContactFindService service;

    @GetMapping("/contacts")
    public List<ContactDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/contact/{id}")
    public ContactDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

}
