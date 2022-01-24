package pl.ppl.addressbook.web;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.ppl.addressbook.api.ContactEntrySaveService;
import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.EmailEntryRequest;
import pl.ppl.addressbook.api.dto.PhoneEntryRequest;
import pl.ppl.addressbook.api.dto.SocialEntryRequest;

@RestController
@Validated
@RequiredArgsConstructor
public class ContactEntryController {

    private final ContactEntrySaveService service;

    @PostMapping("/contact/{contactId}/email")
    public ContactDto createEmailEntry(@PathVariable Long contactId, @RequestBody EmailEntryRequest request) {
        return service.createMailEntry(contactId, request);
    }

    @PutMapping("/contact/{contactId}/email/{emailId}")
    public ContactDto updateEmailEntry(@PathVariable Long contactId,
                                       @PathVariable Long emailId,
                                       @RequestBody EmailEntryRequest request) {
        return service.updateMailEntry(contactId, emailId, request);
    }

    @PostMapping("/contact/{contactId}/phone")
    public ContactDto createPhoneEntry(@PathVariable Long contactId,
                                       @RequestBody PhoneEntryRequest request) {
        return service.createPhoneEntry(contactId, request);
    }

    @PutMapping("/contact/{contactId}/phone/{phoneId}")
    public ContactDto updatePhoneEntry(@PathVariable Long contactId,
                                       @PathVariable Long phoneId,
                                       @RequestBody PhoneEntryRequest request) {
        return service.updatePhoneEntry(contactId, phoneId, request);
    }

    @PostMapping("/contact/{contactId}/social")
    public ContactDto createPhoneEntry(@PathVariable Long contactId,
                                       @RequestBody SocialEntryRequest request) {
        return service.createSocialEntry(contactId, request);
    }

    @PutMapping("/contact/{contactId}/social/{socialId}")
    public ContactDto updatePhoneEntry(@PathVariable Long contactId,
                                       @PathVariable Long socialId,
                                       @RequestBody SocialEntryRequest request) {
        return service.updateSocialEntry(contactId, socialId, request);
    }

}
