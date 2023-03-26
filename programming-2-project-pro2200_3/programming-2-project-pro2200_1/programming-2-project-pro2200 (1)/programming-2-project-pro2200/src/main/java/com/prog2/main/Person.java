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
abstract class Person {
   public String firstname;
   public String lastname;
   public int age;
   public char gender;
   public String phonenumber;
 
  
  public abstract String getCategory();
  
  public Person(String firstname, String lastname, int age, char gender, String phonenumber) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.gender = gender;
    this.phonenumber = phonenumber;
  }
  
  
  public String getFirstname() {
    return firstname;
  }
  
  public int getAge() {
    return age;
  }
  
  public char getGender() {
    return gender;
  }
  
  public String getPhonenumber() {
    return phonenumber;
  }
  
  public String getLastname() {
    return lastname;
  }
  
  public void setFirstame(String firstname) {
    this.firstname = firstname;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public void setGender(char gender) {
    this.gender = gender;
  }
  
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }
  
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  
      @Override
    public String toString() {
        return "Name: " + firstname + " " + lastname + "\nAge: " + age + 
                "\nGender: " + gender + "\nPhonenumber: " + phonenumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return age == person.age &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(phonenumber, person.phonenumber);
    }
}