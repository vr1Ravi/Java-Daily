package com.example.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.err.println("Laptop created");
    }

    @Override
    public void compile() {
     System.out.println("Compiling via Laptop");
    }
}
