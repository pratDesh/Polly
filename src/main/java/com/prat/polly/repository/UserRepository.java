package com.prat.polly.repository;

import com.prat.polly.model.poll.Polly01;
import com.prat.polly.model.user.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);

    User findByUsername(String username);

    User findByUsernameOrEmail(String username, String email);

}
