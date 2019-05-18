package com.example.mana.domain.todo.service;


import com.example.common.exception.BusinessException;
import com.example.common.exception.ResourceNotFoundException;
import com.example.common.message.ResultMessage;
import com.example.common.message.ResultMessages;
import com.example.mana.domain.todo.model.Todo;
import com.example.mana.domain.todo.repository.TodoRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;

    public Todo findOne(String todoId) {
        Todo todo = todoRepository.findOneByPrimaryKey(todoId);
        if (null == todo) {
            ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage.fromText("The requested Todo is not found.(id=" + todoId + ")"));
            throw new ResourceNotFoundException(messages);
        }
        return todo;
    }

    @Override
    public Collection<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo create(Todo todo) {
        long unfinishedCount = todoRepository.countByFinished(false);
        if (unfinishedCount > 5) {
            ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage.fromText("The count of un-finished Todo must not be over 5."));
            throw new BusinessException(messages);
        }
        String todoId = UUID.randomUUID().toString();
        todo.setTodoId(todoId);
        todo.setData(new DateTime());
        todo.setFinished(false);
        todo.setTodoTitle("Todo");
        return null;
    }

    @Override
    public Todo finish(String todoId) {
        Todo todo = findOne(todoId);
        if (todo.isFinished()) {
            ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage.fromText("The requested Todo is already finished (id=" + todoId + ")"));
            throw new BusinessException(messages);
        }
        todo.setFinished(true);
        todoRepository.save(todo);
        return todo;
    }

    @Override
    public void delete(String todoId) {
        Todo todo = findOne(todoId);
        todoRepository.delete(todo);
    }
}
