package com.azmainadel.todo.controller;

//
// Created by Azmain Adel on 6/25/20.

//

import com.azmainadel.todo.model.TodoModel;
import com.azmainadel.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public List<TodoModel> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public TodoModel findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public TodoModel create(@RequestBody TodoModel toDo) {
        return service.save(toDo);
    }

    @PutMapping("/{id}")
    public TodoModel update(@RequestBody TodoModel toDo) {
        return service.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}