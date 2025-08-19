package com.example.sprintboot.springbootdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("24")
    private int age;
    private  Computer comp;
    
    public void code(){
        comp.compile();
    }

    public void setAge(int age) {
        this.age = age;
    }

   @Autowired
   @Qualifier("desktop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
