/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.main;

import java.util.Objects;

/**
 *
 * @author prasan patel and dominic read
 */
public class Staff2 extends Person { 

    /**
     *
     * @param i
     * @return
     */
    public static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void add(Staff2 staff) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    private String duties;
    private int workload;
   
    /**
     *
     * @param firstname
     * @param lastname
     * @param age
     * @param gender
     * @param phonenumber
     * @param duties
     * @param workload
     */
    public Staff2(String firstname, String lastname, int age, char gender, String phonenumber, String duties, int workload) {
        super(firstname, lastname, age, gender, phonenumber);
        this.duties = duties;
        this.workload = workload;
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
        Staff2 staff = (Staff2) obj;
        return workload == staff.workload &&
                Objects.equals(duties, staff.duties);
  }

    @Override
    public String getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


 }



                
            
