/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Steven
 */
public class Circle extends Shape{
    
    static Scanner sc = new Scanner(System.in);
    final double Pi = Math.PI;
    protected double Radius;    
    
    protected double Circumference(){
        return Radius*2*Math.PI;
    }
    
    protected double Area(){
        return Radius*Radius*Pi;
    }
    
    public void GetRadius(){
        System.out.println("What is the radius of the circle");
        while (0==0){
            try{
                Radius = sc.nextDouble();
                break;
            }
            catch (InputMismatchException err){
                sc.next();
                System.out.print("Invalid radius");
            }
        }
    }
    
    
}
