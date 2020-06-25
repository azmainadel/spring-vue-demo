package com.azmainadel.todo.repository;

//   Created by Azmain Adel on 6/25/20.


import com.azmainadel.todo.model.TodoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<TodoModel, String> {
}
