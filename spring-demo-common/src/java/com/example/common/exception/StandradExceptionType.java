package com.example.common.exception;

public enum StandradExceptionType implements ExceptionType {
    SYSTEM("[E500]"), NOTFOUND("[E404]"), BUSINESS("[E600]"), ILLEGAL("[E501]");
    private String type;

    StandradExceptionType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
