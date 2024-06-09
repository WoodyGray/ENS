package com.woody.ENSmonolith.repository;

import com.woody.ENSmonolith.model.Contact;
import com.woody.ENSmonolith.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

}
