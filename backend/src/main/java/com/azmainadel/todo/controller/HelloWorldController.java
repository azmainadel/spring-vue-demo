package com.azmainadel.todo.controller;

//
// Created by Azmain Adel on 6/25/20.

//

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }
}
