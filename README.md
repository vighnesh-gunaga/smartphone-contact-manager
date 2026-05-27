# Smartphone Contact Manager

A RESTful API project built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL for managing smartphone contacts.

## Features

- Add new contacts
- View all contacts
- Search contact by phone number
- Update contact details
- Delete contacts
- MySQL database integration
- REST API architecture
- Layered architecture using Controller, Service, Repository

---

## Technologies Used

- Java 21
- Spring Boot 4
- Spring Data JPA
- Hibernate
- MySQL
- Lombok
- Maven

---

## Project Structure

src
├── controller
├── service
├── repository
├── entity
└── SmartphonecontactmanagerApplication.java

---

## API Endpoints

### 1. Get All Contacts

GET /api/phone

Example:
http://localhost:8081/api/phone

---

### 2. Get Contact By Phone Number

GET /api/phone/{phoneNumber}

Example:
http://localhost:8081/api/phone/9352104516

---

### 3. Add Contact

POST /api/phone

Example JSON:
```json
{
  "firstname": "Vighnesh",
  "lastname": "Gunaga",
  "phoneNumber": "8456123547",
  "email": "vighnesh@gmail.com"
}
```

Author

Developed by Vighnesh Suresh Gunaga, an aspiring full-stack developer passionate about Java, Spring Boot, and backend development.
