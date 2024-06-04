package com.woody.ENSmonolith.controller;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {


    private final UserService service;

    @GetMapping("/contacts")
    public List<Contact> getUserContacts() {
        //todo
        return service.getUserContacts();
    }
}
