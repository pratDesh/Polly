package com.prat.polly.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

//TODO
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private final Auth auth = new Auth();
    private final OAuth2 oAuth2 = new OAuth2();

    public static class Auth{
        private String tokenSecret;
        private Long tokenExpirationMillSec;

        public String getTokenSecret() {
            return tokenSecret;
        }

        public void setTokenSecret(String tokenSecret) {
            this.tokenSecret = tokenSecret;
        }

        public Long getTokenExpirationMillSec() {
            return tokenExpirationMillSec;
        }

        public void setTokenExpirationMillSec(Long tokenExpirationMillSec) {
            this.tokenExpirationMillSec = tokenExpirationMillSec;
        }
    }

    public static final class OAuth2 {
        private List<String> authorizedRedirectUris = new ArrayList<>();

        public List<String> getAuthorizedRedirectUris() {
            return authorizedRedirectUris;
        }

        public void setAuthorizedRedirectUris(List<String> authorizedRedirectUris) {
            this.authorizedRedirectUris = authorizedRedirectUris;
        }
    }

    public Auth getAuth() {
        return auth;
    }

    public OAuth2 getoAuth2() {
        return oAuth2;
    }
}

