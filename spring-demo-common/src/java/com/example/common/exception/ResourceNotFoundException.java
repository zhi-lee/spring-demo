package com.example.common.exception;


import com.example.common.message.ResultMessage;
import com.example.common.message.ResultMessages;

/**
 * @author Nick
 */
public class ResourceNotFoundException extends ResultMessagesNotificationException {

    public ResourceNotFoundException(ResultMessages messages, Throwable throwable) {
        super(messages, throwable);
    }

    public ResourceNotFoundException(ResultMessages messages) {
        this(messages, null);
    }

    @Override
    void setType(ExceptionType type) {
        this.type = StandradExceptionType.NOTFOUND;
    }

    public ResourceNotFoundException(ResultMessage message) {
        super(message);
    }

    public void add(String text) {
        super.add(ResultMessage.fromText(text));
    }
}
