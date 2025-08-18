package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.Appconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
    //    Desktop dt = context.getBean("desk1",  Desktop.class);
    //    Desktop dt = context.getBean("desktop",  Desktop.class);
    //    Desktop d2 = context.getBean("desktop",  Desktop.class);

    Alien a1 = context.getBean(Alien.class);
    a1.code();




    //    dt.compile();

    }
}
