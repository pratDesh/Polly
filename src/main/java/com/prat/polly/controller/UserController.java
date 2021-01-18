package com.prat.polly.controller;

import com.prat.polly.dto.IdentityDTO;
import com.prat.polly.model.poll.Polly01;
import com.prat.polly.model.user.User;
import com.prat.polly.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /*
        Check if username is available.
     */
    public IdentityDTO checkUsernameAvailability(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            return new IdentityDTO(true);
        }
        return new IdentityDTO(false);
    }

    /*
        Check if email is already registered.
     */
    public IdentityDTO checkEmailRegistered(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return new IdentityDTO(true);
        }
        return new IdentityDTO(false);
    }

    /*
        Get polls created by user.
     */
    @GetMapping("/{username}/polls")
    public List<Polly01> getPollsCreatedBy(@PathVariable(value = "username") String username) {

        return null;
    }

    /*
        Get Polls user has voted for.
     */
    @GetMapping("{username}/votes")
    public List<Polly01> getPollsVotedBy(@PathVariable(value = "username") String username) {

        return null;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {

        return Arrays.asList(userRepository.findByUsernameOrEmail("prat19", "prat19"));
    }

}
