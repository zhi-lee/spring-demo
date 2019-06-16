package com.example.common.exception;

public class NullParameterException extends ResourceNotFoundException {
    public NullParameterException(Throwable throwable) {
        super(throwable);
    }

    public NullParameterException() {
        super("[E51003]  Parameter cannot be null");
    }
}
