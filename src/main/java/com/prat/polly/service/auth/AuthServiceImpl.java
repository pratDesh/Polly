package com.prat.polly.service.auth;

import com.prat.polly.dto.UserRegistrationDTO;
import com.prat.polly.model.user.User;
import com.prat.polly.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserRegistrationDTO dto) {
        User user = new User(dto.getName(),
                dto.getUserName(), dto.getEmail(), dto.getPassword());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }
}
