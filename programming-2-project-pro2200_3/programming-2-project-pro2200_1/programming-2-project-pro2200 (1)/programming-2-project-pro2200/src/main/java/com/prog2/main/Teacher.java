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
public class Teacher extends Person {
    private String specialty;
    private String degree;
       private boolean isFullTime;
    private int hoursworked;

    public Teacher(String firstname, String lastname, int age, char gender, String phonenumber, String specialty, 
            String degree, boolean isFullTime, int hoursworked) {
        
        super(firstname, lastname, age, gender, phonenumber);
        
        this.specialty = specialty;
        this.degree = degree;
        this.isFullTime = isFullTime;
        this.hoursworked = hoursworked;
    }

   

    public String getSpecialty() {
        return specialty;
    }

    public String getDegree() {
        return degree;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    @Override
    public String getCategory() {
        return "Teacher";
    }


     @Override
    public String toString() {
        return super.toString() + "\nSpecialty: " + specialty + "\nDegree: " + degree +
                "\nFull-time: " + isFullTime + "\nTeaching Hours: " + hoursworked;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        Teacher teacher = (Teacher) obj;
        return isFullTime == teacher.isFullTime &&
                hoursworked == teacher.hoursworked &&
                Objects.equals(specialty, teacher.specialty) &&
                Objects.equals(degree, teacher.degree);
    }

    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getDepartmentId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



