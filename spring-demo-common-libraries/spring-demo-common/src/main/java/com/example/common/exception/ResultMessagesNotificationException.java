package com.example.common.exception;

import com.example.common.message.ResultMessage;

public abstract class ResultMessagesNotificationException extends RuntimeException{
    public ResultMessagesNotificationException(ResultMessage resultMessage){
        super();
    }

    public ResultMessagesNotificationException (ResultMessage resultMessage,Throwable throwable){
        super(throwable);
    }
}
