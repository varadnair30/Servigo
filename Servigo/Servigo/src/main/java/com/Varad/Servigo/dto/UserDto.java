package com.Varad.Servigo.dto;

import com.Varad.Servigo.enums.UserRole;
import lombok.Data;
@Data
public class UserDto {

    private long id;

    private String email;
    private String password;
    private String name;
    private String lastname;
    private String phone;
    private UserRole role;
}
