package pl.ppl.addressbook.api;

import pl.ppl.addressbook.api.dto.ContactDto;
import pl.ppl.addressbook.api.dto.EmailEntryRequest;
import pl.ppl.addressbook.api.dto.PhoneEntryRequest;
import pl.ppl.addressbook.api.dto.SocialEntryRequest;

public interface ContactEntrySaveService {
    ContactDto createMailEntry(Long contactId, EmailEntryRequest request);

    ContactDto updateMailEntry(Long contactId, Long emailId, EmailEntryRequest request);

    ContactDto createPhoneEntry(Long contactId, PhoneEntryRequest request);

    ContactDto updatePhoneEntry(Long contactId, Long phoneId, PhoneEntryRequest request);

    ContactDto createSocialEntry(Long contactId, SocialEntryRequest request);

    ContactDto updateSocialEntry(Long contactId, Long socialId, SocialEntryRequest request);
}
