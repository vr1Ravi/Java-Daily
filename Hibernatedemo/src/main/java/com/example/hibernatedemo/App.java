package com.example.hibernatedemo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
        // Student s1 = new Student();
        // s1.setRollNo(4);
        // s1.setsName("Tuco");
        // s1.setsAge(35);


        // Laptop l1 = new Laptop();
        // l1.setlId(01);
        // l1.setlName("Mac");
        // l1.setlRam(16);

        // Laptop l2 = new Laptop();
        // l2.setlId(02);
        // l2.setlName("Windows");
        // l2.setlRam(32);


        //  Laptop l3 = new Laptop();
        // l3.setlId(03);
        // l3.setlName("Linux");
        // l3.setlRam(32);

        
        // Aliean a1 = new Aliean();
        // a1.setAid(0);
        // a1.setAname("Skinny Pete");
        // a1.setTech("Meth");
        // Aliean a2 = new Aliean();
        // a2.setAid(1);
        // a2.setAname("Tuco");
        // a2.setTech("Meth");

        // a1.setLaptops(Arrays.asList(l1, l2));
        // a2.setLaptops(Arrays.asList(l3));

       


        // Student s2 = null;
        SessionFactory sf =  new Configuration()
        // .addAnnotatedClass(com.example.hibernatedemo.Aliean.class)
        .addAnnotatedClass(com.example.hibernatedemo.Laptop.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();
        Session session2 = sf.openSession();

        // Transaction transaction = session.beginTransaction();
        // session.persist(l1);
        // session.persist(l2);
        // session.persist(l3);
        // session.persist(a1);
        // session.persist(a2);

        // s2 = session.get(Student.class, 12);
        // session.merge(s1);    // update or create a record
        // s2 = session.get(Student.class, 4);
        // session.remove(s2);     // delete record

        // System.err.println(s2);
        // session.persist(s1);


        // Laptop l = session.get(Laptop.class, 1);
        // System.err.println(l);

        // Query query = session.createQuery("from Laptop where lRam=32");

        // int lRam = 32;
        // Query query = session.createQuery("select lName from Laptop where lRam  = :ram");
        // query.setParameter("ram", lRam);
        // List<Laptop> list = query.getResultList();
        // List<String> list = query.getResultList();

        Laptop l1 = session.get(Laptop.class, 1);
        Laptop l2 = session2.get(Laptop.class, 1);



        System.err.println(l1);
        System.err.println(l2);

       
        // transaction.commit();
        // sf.close();
        session.close();
        session2.close();
        
    }
}
