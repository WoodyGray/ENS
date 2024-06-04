package com.woody.ENSmonolith.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class User {

    private int id;
    private String login;
    private String message;
}
