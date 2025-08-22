package com.example.springsecdemo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {
    
    @GetMapping("/")
    public String greet() {
        return "Hello";
    }
    
    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        System.out.println(request.getSession().getId());
        return "About";
    }
    
}
