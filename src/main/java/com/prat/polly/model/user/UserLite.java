package com.prat.polly.model.user;

public class UserLite {

    private Long id;
    private String name;
    private String username;

    public UserLite() {
    }

    public UserLite(String name, String username) {
        this.name = name;
        this.username = username;
    }
}
