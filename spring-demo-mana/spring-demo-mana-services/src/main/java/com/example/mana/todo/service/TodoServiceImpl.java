package com.example.mana.todo.service;

import com.example.common.exception.BusinessException;
import com.example.mana.todo.entity.Todo;
import com.example.mana.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoInf;

    @Override
    public Collection<Todo> findAll() {
        return todoInf.findAll();
    }

    @Override
    public Todo create(Todo todo) {
        return todo==null?null:todoInf.save(todo);
    }

    @Override
    public Todo finish(String todoId) {
        Todo todo=findOne(todoId);
        if (todo==null){
            throw new BusinessException();
        }
        return todo;
    }

    @Override
    public void delete(String todoId) {

    }

    public Todo findOne(String todoId) {
        return (null == todoId || "".equals(todoId)) ?
                null : todoInf.findOneByPrimaryKey(todoId);
    }
}
