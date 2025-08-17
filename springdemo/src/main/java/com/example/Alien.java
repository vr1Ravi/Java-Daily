package com.example;


public class Alien {
    private int age;
    private int rating;
    // private Laptop lap;
    Computer comp;
    public Alien(){
        System.err.println("called");

    }
    public Alien(int age){
        this.age = age;
        // this.rating = rating;
        // this.comp = comp;

    }
    public int getAge() {
        return age;
    }

    public int getRating() {
        return rating;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    // public void setLap(Laptop lap) {
    //     System.err.println("Laptop created");
    //     this.lap = lap;
    // }
    
    void code(){
        System.err.println("Code!");
        comp.compile();
    }
}
