package com.todo.todo.service;

import com.todo.todo.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAllTodo();
    void saveTodo(Todo todo);
    void updateTodo(Long id, Todo todo);
    Todo getTodoById(Long id);
    void deleteTodo(Long id);
}
