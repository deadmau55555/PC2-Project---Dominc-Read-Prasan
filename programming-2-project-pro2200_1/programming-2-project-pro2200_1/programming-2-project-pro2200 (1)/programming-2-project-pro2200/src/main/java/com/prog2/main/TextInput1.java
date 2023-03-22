
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prasan patel & dominic read
 */
public class TextInput1 {
    
    ArrayList<Staff> staff = new ArrayList();
    
    public static void main(String[] args) {

        readData();
        
        System.out.println(staff);
        
    }  
    
    
    public static void readData() {
            String path = "C:\\Users\\prasan\\SkyDrive\\Desktop\\labs\\programming-2-project-pro2200_1\\text.txt";
    
    File file = new File(path);
    
    try (Scanner input = new Scanner(file)) {
        
        //System.out.println(input.nextLine());
        while (input.hasNext()) {
        String[] eachLine = input.nextLine().split(",");
    
        //System.out.println(Arrays.toString(eachLine));
        
        news staff(eachLine[0], eachLine[1], Integer.parseInt(eachLine[2]), eachLine[3].charAt(0), eachLine[4], Integer.parseInt(eachLine[5]));
 
        }
        
} catch(IOException e){
    System.out.print ("File not found");
}
        
    }
}
