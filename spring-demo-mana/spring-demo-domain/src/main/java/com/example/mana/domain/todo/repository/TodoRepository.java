package com.example.mana.domain.todo.repository;

import com.example.mana.domain.todo.model.Todo;

import java.util.Collection;

/**
 * <p>待办接口</p>
 *
 * @author lizhi
 */
public interface TodoRepository {
    Todo findOneByPrimaryKey(String todoId);

    Collection<Todo> findAll();

    Todo save(Todo todo);

    void delete(Todo todo);

    long countByFinished(boolean finished);
}
