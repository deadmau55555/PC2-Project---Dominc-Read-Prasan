

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prasan patel and dominic read
 */
public class TextInput1 {

    static ArrayList<Staff> staffs = new ArrayList();

    public static void main(String[] args) {

        readData();

   System.out.println(staffs);
    }




    public static void readData() {
    String path = "C:\\Users\\prasan\\SkyDrive\\Desktop\\labs\\programming-2-project-pro2200_1\\text.txt";
    
    File file = new File(path);

    try (Scanner input = new Scanner(file)) {

        //System.out.println(input.nextLine());
        while (input.hasNext()) {
        String[] eachLine = input.nextLine().split(",");

        //System.out.println(Arrays.toString(eachLine));

       staffs.add(new Staff(eachLine[0], eachLine[1], Integer.parseInt(eachLine[2]), eachLine[3].charAt(0), eachLine[4], eachLine[5], Integer.parseInt(eachLine[6])));
 
        }

} catch(IOException e){
    System.out.print ("File not found");
}
    }

    public static void writeData(String file){
    String path = "C:\\Users\\prasan\\SkyDrive\\Desktop\\labs\\programming-2-project-pro2200_1\\text.txt";
     
    // try (FileWriter fw = new FileWriter(file)) {            // over-write mode
      try (FileWriter fw = new FileWriter(path)) {        // appending mode
    // code
     for(Staff staff:staffs){
       //     fw.write(staff.firstname + "," + Staff.lastname + "," + Staff.age + "," + Staff.gender + "," + staff.phonenumber + "," + staff.duties + "," + staff.workload "\n");
     }
}

catch (IOException e) {
    System.out.println("Fail to write to the file");

} }

    private static class Staff {

        public Staff(String par, String par1, int parseInt, char charAt, String par2, String par3, int parseInt1) {
        }
    }
}
// once the try-catch structure is over, the input resource will be released
   
 
    
// once the try-catch structure is over, the input resource will be released
     


