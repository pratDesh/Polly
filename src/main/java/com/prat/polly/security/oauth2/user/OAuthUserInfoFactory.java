package com.prat.polly.security.oauth2.user;

import com.prat.polly.config.AppProperties.Auth;
import com.prat.polly.exceptions.OAuth2AuthenticationProcessingException;
import com.prat.polly.model.user.AuthProvider;

import java.util.Map;

public class OAuthUserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        }
        else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        }
        else {
            throw new OAuth2AuthenticationProcessingException("Login with " + registrationId + " is not supported yet.");
        }
    }
}
