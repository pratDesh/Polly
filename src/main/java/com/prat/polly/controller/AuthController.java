package com.prat.polly.controller;

import com.prat.polly.dto.AuthenticationResponseDTO;
import com.prat.polly.dto.LoginRequestDTO;
import com.prat.polly.dto.UserRegistrationDTO;
import com.prat.polly.model.user.User;
import com.prat.polly.security.TokenProvider;
import com.prat.polly.service.auth.AuthService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);


    @Autowired
    private AuthService authService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider tokenProvider;

    @PostMapping(value = "/signin")
    public ResponseEntity<?> signIn(@RequestBody LoginRequestDTO loginRequest) {
        LOGGER.info("Login request recieved");

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsernameOrEmail(),
                        loginRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = tokenProvider.createToken(authentication);
        return ResponseEntity.ok(new AuthenticationResponseDTO(token));

    }

    @PostMapping(value = "/signup")
    public User signUp(@RequestBody UserRegistrationDTO dto) {
        return authService.createUser(dto);
    }
}
