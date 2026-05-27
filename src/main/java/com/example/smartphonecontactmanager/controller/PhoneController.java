package com.example.smartphonecontactmanager.controller;

import com.example.smartphonecontactmanager.entity.Phone;
import com.example.smartphonecontactmanager.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phone")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping
    public List<Phone> getAllContacts()
    {
        return phoneService.getAllContacts();
    }

    @GetMapping("/{phoneNumber}/{firstname}")
    public Phone getContactByNameAndPhoneNumber(@PathVariable String phoneNumber,@PathVariable String firstname)
    {
        return phoneService.getContactByPhoneAndName(phoneNumber,firstname);
    }

    @PostMapping
    public Phone addContact(@RequestBody Phone phone)
    {
        return phoneService.addContact(phone);
    }

    @PutMapping("/{phoneNumber}")
    public Phone updateContact(@PathVariable String phoneNumber,@RequestBody Phone phone)
    {
        return phoneService.updateContact(phoneNumber,phone);
    }

    @DeleteMapping("/{phoneNumber}")
    public String deleteContact(@PathVariable String phoneNumber)
    {
       phoneService.deleteContact(phoneNumber);
       return "Contact Deleted Successfully";
    }
}
