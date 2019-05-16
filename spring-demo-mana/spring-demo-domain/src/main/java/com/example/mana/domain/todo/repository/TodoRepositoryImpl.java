package com.example.mana.domain.todo.repository;

import com.example.mana.domain.todo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class TodoRepositoryImpl implements TodoRepository {
    @Override
    public Todo findOneByPrimaryKey(String todoId) {
        return null;
    }

    @Override
    public Collection<Todo> findAll() {
        return null;
    }

    @Override
    public Todo save(Todo todo) {
        return null;
    }

    @Override
    public void delete(Todo todo) {

    }

    @Override
    public long countByFinished(boolean finished) {
        return 0;
    }
}
