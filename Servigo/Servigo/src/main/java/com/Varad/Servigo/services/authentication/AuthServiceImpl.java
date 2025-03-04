package com.Varad.Servigo.services.authentication;

import com.Varad.Servigo.dto.SignupRequestDTO;
import com.Varad.Servigo.dto.UserDto;
import com.Varad.Servigo.entity.User;
import com.Varad.Servigo.enums.UserRole;
import com.Varad.Servigo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;
public UserDto signupClient(SignupRequestDTO signupRequestDTO){
    User user = new User();

    user.setName(signupRequestDTO.getName());
    user.setLastname(signupRequestDTO.getLastname());
    user.setEmail(signupRequestDTO.getEmail());
    user.setPhone(signupRequestDTO.getPhone());
    user.setPassword(new BCryptPasswordEncoder().encode(signupRequestDTO.getPassword()));
    user.setRole(UserRole.CLIENT);

    return userRepository.save(user).getDto();
}

public Boolean presentByEmail(String email){
    return userRepository.findFirstByEmail(email) != null;
}

    public UserDto signupCompany(SignupRequestDTO signupRequestDTO){
        User user = new User();
        user.setName(signupRequestDTO.getName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequestDTO.getPassword()));

        user.setRole(UserRole.COMPANY);

        return userRepository.save(user).getDto();
    }

}
