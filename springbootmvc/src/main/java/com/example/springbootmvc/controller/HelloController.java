package com.example.springbootmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String greet(){
        System.err.println("here");
        return "Hello";
    }
}
