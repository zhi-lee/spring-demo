package com.example.common.exception;

import com.example.common.message.ResultMessage;
import com.example.common.message.ResultMessages;

/**
 * @author Nick
 */
public class BusinessException extends ResourceNotFoundException {
    public BusinessException(ResultMessages messages, Throwable throwable) {
        super(messages, throwable);
    }

    public BusinessException(ResultMessages messages) {
        this(messages, null);
    }

    @Override
    void setType(ExceptionType type) {
        this.type = StandradExceptionType.BUSINESS;
    }

    public BusinessException(ResultMessage message) {
        super(message);
    }

    public void add(String text) {
        super.add(ResultMessage.fromText(text));
    }
}
