package com.example.sprintboot.springbootdemo.repo;

import org.springframework.stereotype.Repository;

import com.example.sprintboot.springbootdemo.model.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
System.err.println("saving into database");
    }
}
