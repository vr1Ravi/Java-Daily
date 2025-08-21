package com.example.springbootmvc;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogginAspect.class);

    @Before("execution(* com.example.springbootmvc.service.ProductService.getProductById(..))")
    public void logMethodCall(){
         LOGGER.info("Method called");
    }

    // @After("execution(* com.example.springbootmvc.service.ProductService.getAllProducts(..))")
    // public void logMethodExecuted(){
    //      LOGGER.info("Method executed");
    // }


}
