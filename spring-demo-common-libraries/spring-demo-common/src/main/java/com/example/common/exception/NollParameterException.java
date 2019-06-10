package com.example.common.exception;

public class NollParameterException extends ResourceNotFoundException {
    public NollParameterException(Throwable throwable) {
        super(throwable);
    }

    public NollParameterException() {
        super("[E51003]  Parameter cannot be null");
    }
}
