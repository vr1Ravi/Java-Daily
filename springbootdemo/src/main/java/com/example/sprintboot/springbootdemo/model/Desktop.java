package com.example.sprintboot.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    
    @Override
    public void compile(){
        System.err.println("Compiling via Desktop");
    }
}
