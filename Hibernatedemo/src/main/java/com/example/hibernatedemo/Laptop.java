package com.example.hibernatedemo;





import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
@Cacheable
public class Laptop {
    
    @Id
    private int lId;
    private String lName;
    private int lRam;

    public int getlId() {
        return lId;
    }
    public String getlName() {
        return lName;
    }
    public int getlRam() {
        return lRam;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public void setlRam(int lRam) {
        this.lRam = lRam;
    }

    @Override
    public String toString() {
      
        return  this.lName + "," + this.lId + "," + this.lRam;
    }
 
}
