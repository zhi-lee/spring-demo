package com.example.common.message;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 1、code编码返回
 * 2、text编码返回
 *
 * @author Nick
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ResultMessage implements Serializable {
    //空对象
    private static final Object[] EMPTY_ARRAY = new Object[0];
    private String code;
    private String text;
    private Object[] args;

    private ResultMessage(String code, String text, Object[] args) {
        this.code = code;
        this.text = text;
        this.args = args == null ? EMPTY_ARRAY : args;
    }

    public static ResultMessage fromCode(String code, Object[] args) {
        return new ResultMessage(code, null, args);
    }

    public static ResultMessage fromText(String text) {
        return new ResultMessage(null, text, EMPTY_ARRAY);
    }

    private void writeObj(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObj(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}
