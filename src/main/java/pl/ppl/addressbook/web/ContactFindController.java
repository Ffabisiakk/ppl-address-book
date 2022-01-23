package pl.ppl.addressbook.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import pl.ppl.addressbook.api.ContactFindService;

@RestController
@RequiredArgsConstructor
public class ContactFindController {

    private final ContactFindService service;

}
