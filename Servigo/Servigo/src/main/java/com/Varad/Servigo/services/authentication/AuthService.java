package com.Varad.Servigo.services.authentication;

import com.Varad.Servigo.dto.SignupRequestDTO;
import com.Varad.Servigo.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);

    UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
