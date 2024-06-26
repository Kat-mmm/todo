package com.todo.todo.controller;

import com.todo.todo.entity.Todo;
import com.todo.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping
    public List<Todo> findAll(){
        return todoService.getAllTodo();
    }

    @PostMapping
    public void save(@RequestBody Todo todo){
        todoService.saveTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo finaOne(@PathVariable Long id){
        return todoService.getTodoById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Todo todo){
        this.todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.todoService.deleteTodo(id);
    }
}
