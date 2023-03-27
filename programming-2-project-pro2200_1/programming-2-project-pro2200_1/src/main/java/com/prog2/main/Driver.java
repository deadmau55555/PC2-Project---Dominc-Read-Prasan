/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.prog2.main;

import java.util.List;

/**
 *
 * @author prasan patel and dominic read
 */
public class Driver {

    /**
     * @param args the command line arguments
     * @param True
     */
    public static void main(String[] args, boolean True) {
      
        // Create some test data
        var teacher1 = new Teacher("John", "Doe", 44, 'M', "514-536-5305", "Computer Science", "Sciences", True, 40); 
        
        
        
        
        
    //    Teacher dean = new Dean("Alice Brown", 10, 2);
        

        // Test the addTeacher method of the Department class
        department.addTeacher(teacher1);
     

        // Test the getDean method of the Department class
    //    System.out.println("Department dean: " + department.getDean().getName());

        // Test the getTeachers method of the Department class
        List<Teacher> teachers = department.getTeachers();
        System.out.println("Department teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }

        // Test the getYearsAsDean method of the Dean class
    //    if (dean instanceof Dean) {
    //        System.out.println(dean.getName() + " has been dean for " + ((Dean) dean).getYearsAsDean() + " years.");
        }

        // Test other methods or functionality of your project as needed

    private static class department {

        private static void addTeacher(Teacher teacher1) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addStaff2(Staff2 staff2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static List<Teacher> getTeachers() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public department() {
        }
    }
    }

