package com.example.mana.domain.todo.model;

import lombok.Data;
import lombok.ToString;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@ToString
public class Todo implements Serializable {
    String todoId;
    String todoTitle;
    boolean finished;
    DateTime data;
}
