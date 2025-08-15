package com.example.hibernatedemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollNo = 12;
    private String sName = "Skinny pete";
    private int sAge= 25;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public int getsAge() {
        return sAge;
    }
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
    
    @Override
    public String toString() {
        return "Student{" +
        "rollNo=" + rollNo +
        "name=" + sName +
        "age=" + sAge;
    };
}
