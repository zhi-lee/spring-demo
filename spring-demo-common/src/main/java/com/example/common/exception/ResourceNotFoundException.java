package com.example.common.exception;

import com.example.common.message.ResultMessage;

public class ResourceNotFoundException extends ResultMessagesNotificationException {
    public ResourceNotFoundException(Throwable throwable) {
        super(ResultMessage.fromText("[E51001] resource not find"), throwable);
    }

    public ResourceNotFoundException(String text) {
        super(ResultMessage.fromText(text));
    }
}
