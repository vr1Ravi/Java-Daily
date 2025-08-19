package com.example.sprintboot.springbootdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sprintboot.springbootdemo.model.Laptop;
import com.example.sprintboot.springbootdemo.repo.LaptopRepository;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGood(Laptop lap){
      return true;
    }
}
