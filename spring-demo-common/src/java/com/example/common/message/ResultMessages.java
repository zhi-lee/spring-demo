package com.example.common.message;

import lombok.Data;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;

/**
 * <p>消息类型</p>
 *
 * @author Nick
 */
@Data
public class ResultMessages implements Serializable, Iterable<ResultMessage> {
    private ResultMessageType type;
    /**
     * 消息载体
     */
    private List<ResultMessage> messages = new ArrayList<>();

    private ResultMessages(ResultMessageType type) {
        this(type, null);
    }

    private ResultMessages(ResultMessageType type, Collection<ResultMessage> messages) {
        this.type = type;
        if (messages != null || messages.size() != 0)
            addAll(messages);
    }

    @Override
    public Iterator<ResultMessage> iterator() {
        return messages.iterator();
    }

    @Override
    public void forEach(Consumer<? super ResultMessage> action) {
        messages.forEach(action);
    }

    @Override
    public Spliterator<ResultMessage> spliterator() {
        return messages.spliterator();
    }

    public boolean isEmpty() {
        return messages.isEmpty();
    }

    public boolean addAll(Collection<ResultMessage> messages) {
        return this.messages.addAll(messages);
    }

    public ResultMessages add(ResultMessage message) {
        if (message == null)
            throw new IllegalArgumentException("message must not be null");
        messages.add(message);
        return this;
    }

    public ResultMessages add(String code, Object... args) {
        if (null == code || "".equals(code))
            throw new IllegalArgumentException("code must not be null");
        messages.add(ResultMessage.fromCode(code, args));
        return this;
    }

    public ResultMessages add(String text) {
        if (null == text || "".equals(text))
            throw new IllegalArgumentException("text must not be null");
        messages.add(ResultMessage.fromText(text));
        return this;
    }

    /**
     * <p>return new ResultMessages</p>
     *
     * @return
     */
    public static ResultMessages success() {
        return new ResultMessages(StandardResultMessageType.SUCCESS);
    }

    public static ResultMessages info() {
        return new ResultMessages(StandardResultMessageType.INFO);
    }

    @Deprecated
    public static ResultMessages warn() {
        return new ResultMessages(StandardResultMessageType.WARN);
    }

    public static ResultMessages error() {
        return new ResultMessages(StandardResultMessageType.ERROR);
    }

    public static ResultMessages danger() {
        return new ResultMessages(StandardResultMessageType.DANGER);
    }
}
