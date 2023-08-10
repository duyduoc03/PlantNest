package com.example.plantnest.dto;

import lombok.Data;

@Data
public class UserDTO {

    private int userId;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String role;
}
