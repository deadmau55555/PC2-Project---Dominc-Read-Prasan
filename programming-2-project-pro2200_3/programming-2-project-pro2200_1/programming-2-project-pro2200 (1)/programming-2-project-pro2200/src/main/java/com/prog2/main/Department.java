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
    private int departmentId;
    private String lastname;
     private String firstname;


public Department(int departmentId, String id) {
        this.id = id;
        this.teachers = new ArrayList<>();
        this.staff = new ArrayList<>();
         this.departmentId = departmentId;
        
}

    
    public void setDean(Teacher dean) throws Exception {
        if (!teachers.contains(dean)) {
            throw new Exception("Dean must be a teacher of the department.");
        }
        this.dean = dean;
    }
    
    public int getDepartmentId() {
        return departmentId;
    }

            public String getId() {
        return id;
    }
    
    public Teacher getDean() {
        return dean;
    } 
    
    
      public String getFirstname() {
        return firstname;
    }
      
        public String getLastname() {
        return lastname;
    }
    
    
    
    public void addTeacher(Teacher teacher) throws Exception {
        if (teacher.getDepartmentId() != departmentId) {
            throw new Exception("Teacher belongs to a different department");
        }
        if (teachers.contains(teacher)) {
            throw new Exception("Teacher already added to the department");
        }
        teachers.add(teacher);
     //   saveToFile(teacher, "teachers.csv");
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
    
    /**
    
    public void saveToFile() {
        try {
            FileWriter fw = new FileWriter("department_" + id + ".txt", true);
            for (Teacher teacher : teachers) {
                fw.write("teacher," + teacher.getId() + "," + teacher.getName() + "\n");
            }
            for (Staff staff : staff) {
                fw.write("staff," + staff.getId() + "," + staff.getFirstname() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
    
  // public void loadFromFile() {
    // try {
      //     File file = new File("department_" + id + ".txt");
     //     if (!file.exists()) {
     //         return;
      //   }
            
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
        
    


