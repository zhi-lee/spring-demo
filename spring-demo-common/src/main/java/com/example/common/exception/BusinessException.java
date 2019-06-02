package com.example.common.exception;

public class BusinessException extends ResourceNotFoundException{
    public BusinessException(Throwable throwable) {
        super(throwable);
    }

    public BusinessException() {
        super("[E51002] The requested id is not found");
    }
}
