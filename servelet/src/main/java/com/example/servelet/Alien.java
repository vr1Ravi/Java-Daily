package com.example.servelet;

public class Alien {
    private int aid;
    private String aname;

    public int getAid() {
        return aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
           return  "Alien---->" + aid + " " + aname;
    }
}
