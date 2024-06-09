package com.woody.ENSmonolith.service.impl;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.model.User;
import com.woody.ENSmonolith.repository.ContactRepository;
import com.woody.ENSmonolith.repository.UserRepository;
import com.woody.ENSmonolith.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository repository;
    private final ContactRepository contactRepository;
    @Override
    public Set<Contact> getUserContactsById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.stream().findFirst().get().getContacts();
    }

    @Override
    public void addUserContactsById(Set<Contact> contacts, Integer id) {
        User user = findById(id);
        if (user.getContacts().isEmpty())
            user.setContacts(contacts);
        else {
            Set<Contact> userContacts = user.getContacts();
            userContacts.addAll(contacts);
            user.setContacts(userContacts);
        }
        repository.save(user);
    }

    @Override
    public User saveUser(User user) {
        repository.save(user);
        repository.flush();
        return user;
    }

    @Override
    public User findById(Integer id) {
        if (repository.findById(id).isPresent())
            return repository.findById(id).get();
        return null;

    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}
