package com.azmainadel.todo.model;

//
// Created by Azmain Adel on 6/25/20.

//

import org.springframework.data.annotation.Id;

public class TodoModel {

    @Id
    private String id;
    private String title;
    private boolean completed;

    public TodoModel(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
