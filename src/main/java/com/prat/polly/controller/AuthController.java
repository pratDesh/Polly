package com.prat.polly.controller;

import com.prat.polly.dto.LoginRequestDTO;
import com.prat.polly.dto.UserRegistrationDTO;
import com.prat.polly.model.user.User;
import com.prat.polly.service.auth.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/signin")
    public User signIn(@RequestBody LoginRequestDTO loginRequest) {
        return null;
    }

    @PostMapping(value = "/signup")
    public User signUp(@RequestBody UserRegistrationDTO dto) {
        return authService.createUser(dto);
    }
}
