package com.example;

public class Laptop implements Computer {
    public Laptop(){
        System.err.println("Laptop created");
    }

    @Override
    public void compile() {
     System.out.println("Compiling via Laptop");
    }
}
