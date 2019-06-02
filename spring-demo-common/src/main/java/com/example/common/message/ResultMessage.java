package com.example.common.message;

import lombok.Data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


@Data
public class ResultMessage implements Serializable {
    private String text;
    private int code;

    private ResultMessage(String text, int code) {
        this.code = code;
        this.text = text;
    }

    public static ResultMessage fromCode(int code) {
        return new ResultMessage("", code);
    }

    public static ResultMessage fromText(String text) {
        if (null==text||"".equals(text))
            throw new NullPointerException("[E51000] result message cannot be null");
        return new ResultMessage(text, 200);
    }

    private void write(ObjectOutputStream output) throws IOException {
        output.defaultWriteObject();
    }

    private void read(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

}
