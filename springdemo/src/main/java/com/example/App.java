package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Creating container via XML
       ApplicationContext context = new ClassPathXmlApplicationContext("xmlcontext.xml");
   
       Alien a1 = (Alien) context.getBean("alien");
    //    Alien a2 = (Alien) context.getBean("alien");

    //  System.err.println(a1.getAge() + " " + a1.getRating());
       a1.code();

  }
}
