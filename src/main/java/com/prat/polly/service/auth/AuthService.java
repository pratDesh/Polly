package com.prat.polly.service.auth;

import com.prat.polly.dto.UserRegistrationDTO;
import com.prat.polly.model.user.User;

public interface AuthService {

    User createUser(UserRegistrationDTO userRegistrationDto);
}
