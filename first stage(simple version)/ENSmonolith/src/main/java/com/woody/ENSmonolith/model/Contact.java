package com.woody.ENSmonolith.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Contact {
    private int id;
    private String login;
    private int user_id;
}
