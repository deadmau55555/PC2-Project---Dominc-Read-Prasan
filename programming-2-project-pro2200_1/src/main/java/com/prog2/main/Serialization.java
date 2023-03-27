package com.prog2.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prasan
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author prasan patel and dominic read
 *  * Serializes data into a file
 */
public class Serialization {
    
    public static void main(String [] args) {
        
        //Serialize An Object
        Staff2 staff = new Staff2("Sean", "Burks", 20, 'm',"514999999", "busboy", 40 );
        Staff retrivedStaff;
        
        String path = "Users\\prasan\\SkyDrive\\Desktop\\labs\\programming-2-project-pro2200_3\\programming-2-project-pro2200_3\\programming-2-project-pro2200_1\\text.txt";
        
        try (FileOutputStream fos = new FileOutputStream(path)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(oos);
        } catch (Exception e) {
        
    }
        
        //Deserialize An Object
       // step 1 create a FileOutputStream object
try (FileInputStream fis = new FileInputStream(path)) {
    // step 2 create an ObjectOutputStream object
    ObjectInputStream ois = new ObjectInputStream(fis);
    // step 3 call writeObject() to write the object to a file
     retrivedStaff = (Staff) ois.readObject();      
     
     System.out.println(retrivedStaff);
     
} catch (Exception e) {
} 
        
    }
}

