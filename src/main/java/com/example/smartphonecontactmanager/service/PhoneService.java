package com.example.smartphonecontactmanager.service;


import com.example.smartphonecontactmanager.entity.Phone;
import com.example.smartphonecontactmanager.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> getAllContacts() {
        return phoneRepository.findAll();
    }


    public Phone addContact(Phone phone) {
        return phoneRepository.save(phone);
    }




    public void deleteContact(String phoneNumber) {
        phoneRepository.deleteByPhoneNumber(phoneNumber);
    }

    public Phone getContactByPhoneAndName(String phoneNumber, String firstname) {
        return phoneRepository.findByPhoneNumberAndFirstname(phoneNumber,firstname);
    }

    public Phone updateContact(String phoneNumber, Phone updatedPhone) {

        Phone existingPhone = phoneRepository.findByPhoneNumber(phoneNumber);

        existingPhone.setFirstname(updatedPhone.getFirstname());
        existingPhone.setLastname(updatedPhone.getLastname());
        existingPhone.setPhoneNumber(updatedPhone.getPhoneNumber());
        existingPhone.setTitle(updatedPhone.getTitle());

        return phoneRepository.save(existingPhone);
    }
}
