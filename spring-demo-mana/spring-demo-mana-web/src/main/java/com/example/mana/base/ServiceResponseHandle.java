package com.example.mana.base;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ServiceResponseHandle {
    static ServiceResponse ok(Object data) {
        return new ServiceResponse(200, data, "");
    }

    static ServiceResponse failed(String message) {
        return new ServiceResponse(400, null, message);
    }

    @Data
    @AllArgsConstructor
    static class ServiceResponse {
        private int code;
        private Object data;
        private String message;
    }

}
