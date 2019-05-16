package com.example.mana.domain.todo.service;

import com.example.mana.domain.todo.model.Todo;

import java.util.Collection;

/**
 * <p>待办列表</p>
 *
 * @author lizhi
 */
public interface TodoService {
    Collection<Todo> findAll();

    Todo create(Todo todo);

    Todo finish(String todoId);

    void delete(String todoId);
}
