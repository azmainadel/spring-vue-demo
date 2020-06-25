package com.azmainadel.todo.service;

//
// Created by Azmain Adel on 6/25/20.
// Copyright (c) 2020 Field Buzz. All rights reserved.
//

import com.azmainadel.todo.exception.EntityNotFoundException;
import com.azmainadel.todo.model.TodoModel;
import com.azmainadel.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<TodoModel> findAll() {
        return repository.findAll();
    }

    public TodoModel findById(String id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public TodoModel save(TodoModel toDo) {
        return repository.save(toDo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
