package com.woody.ENSmonolith.service.impl;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.model.User;
import com.woody.ENSmonolith.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserServiceImpl implements UserService {
    @Override
    public List<Contact> getUserContacts() {
        return List.of(
                Contact.builder().id(1).login("woody").user_id(1).build()
        );
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User findByLogin(Integer id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }
}
