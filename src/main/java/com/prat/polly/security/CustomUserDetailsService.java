package com.prat.polly.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        //        User user = userRepository.findById(id).orElseThrow(
        //                () -> new ResourceNotFoundException("User", "id", id)
        //        );
        //
        //        return UserPrincipal.signUp(user);

        return null;
    }
}
