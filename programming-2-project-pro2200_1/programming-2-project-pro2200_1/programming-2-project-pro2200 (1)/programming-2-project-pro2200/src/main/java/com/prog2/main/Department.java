/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prasan patel & dominic read
 */
public class Department {

private String id;
    private Teacher dean;
    private List<Teacher> teachers;
    private List<Staff> staff;    


public Department(String id) {
        this.id = id;
        this.teachers = new ArrayList<>();
        this.staff = new ArrayList<>();
        
}
        public String getId() {
        return id;
    }
    
    public void setDean(Teacher dean) {
        if (!teachers.contains(dean)) {
            throw new IllegalArgumentException("Dean must be a teacher of the department.");
        }
        this.dean = dean;
    }
    
    public Teacher getDean() {
        return dean;
    }
    
    public void addTeacher(Teacher teacher) {
        if (teachers.contains(teacher)) {
            throw new IllegalArgumentException("Teacher already added to department.");
        }
        teachers.add(teacher);
    }
    
    public void removeTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            throw new IllegalArgumentException("Teacher not found in department.");
        }
        teachers.remove(teacher);
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    public void addStaff(Staff staff) {
        if (this.staff.contains(staff)) {
            throw new IllegalArgumentException("Staff already added to department.");
        }
        this.staff.add(staff);
    }
    
    public void removeStaff(Staff staff) {
        if (!this.staff.contains(staff)) {
            throw new IllegalArgumentException("Staff not found in department.");
        }
        this.staff.remove(staff);
    }
    
    public List<Staff> getStaff() {
        return staff;
    }
    
    public void saveToFile() {
        try {
            FileWriter fw = new FileWriter("department_" + id + ".txt", true);
            for (Teacher teacher : teachers) {
                fw.write("teacher," + teacher.getId() + "," + teacher.getName() + "\n");
            }
            for (Staff staff : staff) {
                fw.write("staff," + staff.getId() + "," + staff.getName() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
  //  public void loadFromFile() {
 //      try {
    //        File file = new File("department_" + id + ".txt");
    //        if (!file.exists()) {
      //          return;
      //     }
            
           // BufferedReader br = new BufferedReader(new FileReader(file));
          //  String line;
          //  while ((line = br.readLine()) != null) {
           //     String[] tokens = line.split(",");
             //   if (tokens[0].equals("teacher")) {
             //       teachers.add(new Teacher(tokens[1], tokens[2]));
             //   } else if (tokens[0].equals("staff")) {
              //      staff.add(new Staff(tokens[1], tokens[2]));
          //      }
        //    }
     //       br.close();
     //   } catch (IOException e) {
      //      e.printStackTrace();
      //  }
  //  }
}
        
    


