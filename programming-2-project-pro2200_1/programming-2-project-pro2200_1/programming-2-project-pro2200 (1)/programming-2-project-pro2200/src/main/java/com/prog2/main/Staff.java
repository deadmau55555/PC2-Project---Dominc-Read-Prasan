/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.main;

import java.util.Objects;

/**
 *
 * @author prasan patel & dominic read
 */
public class Staff extends Person {
    private String duties;
    private int workload;
   

    public Staff(String firstname, String lastname, int age, char gender, String phonenumber, String duties, int workload) {
        super(firstname, lastname, age, gender, phonenumber);
        this.duties = duties;
        this.workload = workload;
    }

    public String getDuty() {
        return duties;
    }

    public int getWorkload() {
        return workload;
    }

    @Override
    public String getCategory() {
        return "Staff";
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuties: " + duties + "\nWorkload: " + workload;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        Staff staff = (Staff) obj;
        return workload == staff.workload &&
                Objects.equals(duties, staff.duties);
  }

    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


                
            
