package com.example.common.exception;

import com.example.common.message.ResultMessage;
import com.example.common.message.ResultMessages;
import com.example.common.message.StandardResultMessageType;
import lombok.Data;

import java.util.Collection;

/**
 * <p>异常基础类</p>
 *
 * @author Nick
 */
@Data
public abstract class ResultMessagesNotificationException extends RuntimeException {
    private ResultMessages messages=null;
    protected ExceptionType type = null;

    /**
     * @param messages
     * @param throwable
     */
    public ResultMessagesNotificationException(ResultMessages messages, Throwable throwable) {
        super(throwable);
        if (messages == null)
            throw new IllegalArgumentException(StandradExceptionType.ILLEGAL + ResultMessage.class.getName() + " must not be null");
        if (messages.getType() != StandardResultMessageType.ERROR)
            throw new ClassCastException(StandradExceptionType.ILLEGAL + messages.getType().toString() + " cannot not be cast to error");
        this.messages = messages;
    }

    /**
     * @param message
     */
    public ResultMessagesNotificationException(ResultMessage message) {
        checkLegel(message);
        this.messages = ResultMessages.error();
        this.messages.add(message);
    }

    public void add(ResultMessage message) {
        checkLegel(message);
        this.messages.add(message);
    }

    public void addAll(Collection<ResultMessage> messages) {
        if (messages == null || messages.isEmpty())
            throw new IllegalArgumentException(StandradExceptionType.ILLEGAL + ResultMessage.class.getName() + "must not be null");
        this.messages.addAll(messages);
    }

    abstract void setType(ExceptionType type);

    private void checkLegel(ResultMessage message) {
        if (message == null)
            throw new IllegalArgumentException(StandradExceptionType.ILLEGAL + ResultMessage.class.getName() + "must not be null");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ResultMessage o : messages) {
            builder.append(type.toString());
            builder.append(o.getText());
        }
        return builder.toString();
    }
}
