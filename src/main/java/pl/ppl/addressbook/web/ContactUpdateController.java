package pl.ppl.addressbook.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import pl.ppl.addressbook.api.ContactFindService;
import pl.ppl.addressbook.api.ContactUpdateService;

@RestController
@RequiredArgsConstructor
public class ContactUpdateController {

    private final ContactUpdateService service;

}
