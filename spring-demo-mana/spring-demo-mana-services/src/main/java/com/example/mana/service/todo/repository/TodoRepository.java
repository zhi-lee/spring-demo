package com.example.mana.service.todo.repository;

import com.example.mana.service.todo.entity.Todo;

import java.util.Collection;

public interface TodoRepository {
    Todo findOneByPrimaryKey(String todoId);

    Collection<Todo> findAll();

    Todo save(Todo todo);

    void update(Todo todo);

    void delete(Todo todo);

    long countByFinished(boolean finished);
}
