package com.example.hibernatedemo;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="aliean_table")
public class Aliean {
    @Id
    @Column(name="aliean_id")
    private int aid;
    private String aname;
    private String tech;

    @OneToMany
    private List<Laptop> laptops;


    @Transient         // This will not get added into database
    private String Role;

    public int getAid() {
        return aid;
    }
    public String getAname() {
        return aname;
    }
    public String getTech() {
        return tech;
    }
    public List<Laptop> laptops() {
        return laptops;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
