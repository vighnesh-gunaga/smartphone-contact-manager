package com.example.smartphonecontactmanager.repository;

import com.example.smartphonecontactmanager.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhoneRepository extends JpaRepository<Phone,Long> {
//    Optional<Phone> findByPhoneNumberAndFirstName(String phoneNumber, String firstname);

    void deleteByPhoneNumber(String phoneNumber);


    Phone findByPhoneNumberAndFirstname(String phoneNumber, String firstname);

    Phone findByPhoneNumber(String phoneNumber);
}
