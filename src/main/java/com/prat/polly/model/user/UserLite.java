package com.prat.polly.model.user;

public class UserLite {

    Long id;
    String username;
    String summary;

    public UserLite() {
    }

    public UserLite(Long id, String username, String summary) {
        this.id = id;
        this.username = username;
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
