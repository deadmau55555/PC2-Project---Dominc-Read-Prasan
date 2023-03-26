/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author prasan patel & dominic read
 */
public class TextInput2 {
    public static String main(String[] args) {
        String path = "\"C:\\Users\\domre\\OneDrive\\Desktop\\test.txt\"";
    
        File file = new File(path);
        
        String str = "";

        try (Scanner input = new Scanner(file)) {
            str = input.nextLine();
    }   catch (IOException e) {
            System.out.println(String.format("File %s does not exist", path));
    }

    return str;
    }
        
}        
    
