package com.Varad.Servigo.dto;

import com.Varad.Servigo.enums.UserRole;
import lombok.Data;

@Data
public class SignupRequestDTO {

    private long id;

    private String email;
    private String password;
    private String name;
    private String lastname;
    private String phone;

}
