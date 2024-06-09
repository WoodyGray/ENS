package com.woody.ENSmonolith.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "contacts")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Id
    @GeneratedValue
    private Integer id;
    private String login;

    @ElementCollection
    @CollectionTable(name = "contact_numbers", joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "phone_number")
    private Set<String> phoneNumbers;


    @ElementCollection
    @CollectionTable(name = "contact_emails", joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "email")
    private Set<String> emails;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(login, contact.login) && Objects.equals(phoneNumbers, contact.phoneNumbers) && Objects.equals(emails, contact.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, phoneNumbers, emails);
    }
}
