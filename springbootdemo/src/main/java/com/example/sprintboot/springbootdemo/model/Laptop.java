package com.example.sprintboot.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    
    @Override
    public void compile(){
       System.err.println("Compiling via Laptop");
    }
}
