package com.prat.polly.dto;

public class IdentityDTO {
    private Boolean valid;

    public IdentityDTO(Boolean valid) {
        this.valid = valid;
    }

    public Boolean isValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
