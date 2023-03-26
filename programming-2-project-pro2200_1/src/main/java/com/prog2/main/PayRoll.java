/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prog2.main;

/**
 *
 * @author prasan patel and dominic read
 */
public interface PayRoll {
    double ComputePayRoll();
}    

class FullTimeTeacher implements PayRoll {
    private int degreeRate;

    public FullTimeTeacher(int degreeRate) {
        this.degreeRate = degreeRate;
    }

    public double ComputePayRoll() {
        return (32 * degreeRate * 2) * 0.85;
    }
    {
   FullTimeTeacher teacher1 = new FullTimeTeacher(112);
System.out.println("Full-time teacher 1 salary: " + teacher1.ComputePayRoll());
    }
}

class PartTimeTeacher implements PayRoll {
    private int degreeRate;
    private int hoursWorked;

    public PartTimeTeacher(int degreeRate, int hoursWorked) {
        this.degreeRate = degreeRate;
        this.hoursWorked = hoursWorked;
    }

public double ComputePayRoll() {
        return (hoursWorked * degreeRate * 2) * 0.76;
    }
    {
    PartTimeTeacher teacher2 = new PartTimeTeacher(82, 20);
System.out.println("Part-time teacher 2 salary: " + teacher2.ComputePayRoll());
    }
}

class Staff implements PayRoll {
    private int workload;

    public Staff(int workload) {
        if (workload > 40) {
            this.workload = 40;
        } else {
            this.workload = workload;
        }
        {
    Staff staff1 = new Staff(35);
System.out.println("Staff 1 salary: " + staff1.ComputePayRoll());   
        }
    }
// staff salary 
    public double ComputePayRoll() {
        return (workload * 32 * 2) * 0.75;
    }
}