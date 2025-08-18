package com.example.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public Desktop(){
        System.err.println("Desk created!");
    }
    
    @Override
    public void compile() {
        System.out.println("Compiling via Desktop");
        
    }
}
