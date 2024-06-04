package com.woody.ENSmonolith.service;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.model.User;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserService {

  List<Contact> getUserContacts();
  User saveUser(User user);
  User findByLogin(Integer id);

  User updateUser(User user);

  void deleteUser(Integer id);
}
