package com.example.springjdbc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private String name;
    private int rollNo;
    private int marks;

    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student-->" + name + ", " + rollNo + ", " + marks;
    }

}
