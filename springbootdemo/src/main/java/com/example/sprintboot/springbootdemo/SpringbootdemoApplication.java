package com.example.sprintboot.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sprintboot.springbootdemo.model.Alien;
import com.example.sprintboot.springbootdemo.model.Laptop;
import com.example.sprintboot.springbootdemo.service.LaptopService;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		
	    ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);

		LaptopService laptopService = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		laptopService.addLaptop(lap);
		
		// Alien a1 = context.getBean(Alien.class);
		// a1.code();
	}

}
