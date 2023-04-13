/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author fpt
 */
public class Tools {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static int getAnInteger(){
        int n;
        do{
            try {
          
        n = Integer.parseInt(sc.nextLine());
        return n;   
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer?");
            }
        }while(true);
    }
}

