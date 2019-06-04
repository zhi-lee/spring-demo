package com.example.mana.service.todo.service;

import com.example.mana.service.todo.entity.Todo;

import java.util.Collection;

public interface TodoService {
    Collection<Todo> findAll();

    Todo create(Todo todo);

    Todo finish(String todoId);

    void delete(String todoId);
}
