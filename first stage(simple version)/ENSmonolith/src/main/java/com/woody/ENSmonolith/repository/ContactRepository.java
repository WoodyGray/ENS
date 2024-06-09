package com.woody.ENSmonolith.repository;

import com.woody.ENSmonolith.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
