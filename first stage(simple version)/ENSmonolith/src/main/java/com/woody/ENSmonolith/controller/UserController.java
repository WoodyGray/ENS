package com.woody.ENSmonolith.controller;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.model.User;
import com.woody.ENSmonolith.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {


    private final UserService service;


    @GetMapping("/contacts")
    public Set<Contact> getUserContacts() {
//        service.saveUser(
//                User.builder()
//                        .message("call me")
//                        .contacts(
//                                Set.of(
//                                        Contact.builder()
//                                                .login("alex")
//                                                .emails(Set.of("alex@mail.ru"))
//                                                .build(),
//                                        Contact.builder()
//                                                .login("mari")
//                                                .emails(Set.of("mari@mail.ru"))
//                                                .build()
//                                )
//                        )
//                        .login("woody")
//                        .build()
//        );
//        service.saveUser(
//                User.builder()
//                        .message("sos")
//                        .contacts(
//                                Set.of(
//                                        Contact.builder()
//                                                .login("hospital")
//                                                .emails(Set.of("hospital@mail.ru"))
//                                                .build(),
//                                        Contact.builder()
//                                                .login("mari")
//                                                .emails(Set.of("mari@mail.ru"))
//                                                .build()
//                                )
//                        )
//                        .login("ugl")
//                        .build()
//        );


        //todo
        return service.getUserContactsById(102);
    }

    @PostMapping("/contacts")
    public void addUserContacts(@RequestBody Set<Contact> contacts){
        service.addUserContactsById(contacts, 102);
    }
}
