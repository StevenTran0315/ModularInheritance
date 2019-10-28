/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance.Circle;
import java.util.Scanner;
import java.util.*;
import modular.inheritance.Shape;
/**
 *
 * @author Steven
 */
public class Circle extends Shape{
    
    static Scanner sc = new Scanner(System.in);
    final double Pi = Math.PI;
    protected double Radius;    
    
    public double Circumference(){ //Calculates the circumference
        return Radius*2*Math.PI;
    }
    
    public double Area(){ //Calculates the area
        return Radius*Radius*Pi;
    }
    
    public void GetRadius(){ //Asks for the radius
        System.out.println("What is the radius of the circle");
        while (0==0){ //Loops until a valid input is given
            try{ 
                Radius = sc.nextDouble(); //tries to get a valid double
                break;
            }
            catch (InputMismatchException err){ //If input is invalid, the user tries again
                sc.next();
                System.out.print("Invalid radius");
            }
        }
    }
    
    
}
