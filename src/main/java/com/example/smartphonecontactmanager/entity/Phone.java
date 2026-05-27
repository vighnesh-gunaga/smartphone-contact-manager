package com.example.smartphonecontactmanager.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phone_book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false,name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;

    private String title;


}
