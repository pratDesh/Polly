package com.prat.polly.controller;

import com.prat.polly.dto.IdentityDTO;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    public IdentityDTO checkUsernameAvailability(String username) {
        //TODO

        return null;
    }

    public IdentityDTO checkEmailRegistered(String email) {
        //TODO

        return null;
    }

}
