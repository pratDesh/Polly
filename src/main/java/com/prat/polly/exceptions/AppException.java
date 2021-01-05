package com.prat.polly.exceptions;

public class AppException extends RuntimeException {

    public AppException(String errorMessage) {
        super(errorMessage);
    }

    public AppException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
