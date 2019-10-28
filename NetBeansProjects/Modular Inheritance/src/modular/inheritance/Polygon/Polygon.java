/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance.Polygon;

import java.util.InputMismatchException;
import java.util.Scanner;
import modular.inheritance.Shape;

/**
 *
 * @author liamu
 */
public class Polygon extends Shape{
    static Scanner sc = new Scanner(System.in); 
    public static double length;
    public static double height;
    public static double base;
    static double sideLength;
   
    

    
    public double getSideLength(String question){ //Method to get a side length when a question is inputted
        System.out.print(question); //prints the question
        while(true){ //loops until valid answer is inputted
            try{
                sideLength = sc.nextDouble(); //trys to get a double
                break;
             }
             catch(InputMismatchException err){ //if input is invalid they try again
                sc.next();
                System.out.println("Not a valid Choice. Please try again.");
             }
        }
        return sideLength; //returns the valid input given
    }
}
