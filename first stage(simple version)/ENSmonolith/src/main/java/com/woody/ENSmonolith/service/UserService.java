package com.woody.ENSmonolith.service;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface UserService {

  Set<Contact> getUserContactsById(Integer id);

  void addUserContactsById(Set<Contact> contacts, Integer id);
  User saveUser(User user);
  User findById(Integer id);

  User updateUser(User user);

  void deleteUser(Integer id);
}
