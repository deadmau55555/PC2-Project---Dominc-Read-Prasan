/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.main;

/**
 *
 * @author prasan patel and dominic read 
 */
public class Dean extends Teacher {
    private int yearsAsDean;
    private int yearsAsTeacher;


    public Dean( String firstname, String lastname, int age, char gender, String phonenumber, String specialty, 
            String degree, boolean isFullTime, int hoursworked, int yearsAsTeacher, int yearsAsDean) {

        super(firstname, lastname, age, gender, phonenumber, specialty, 
            degree, isFullTime, hoursworked);
        this.yearsAsDean = yearsAsDean;
        this.yearsAsTeacher = yearsAsTeacher;
    }

    public int getYearsAsDean() {
        return yearsAsDean;
    }

    public void setYearsAsDean(int yearsAsDean) {
        this.yearsAsDean = yearsAsDean;
    }

    
}
