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
    public double Radius;    
    
    @Override
    public double Perimeter(){ //Calculates the circumference
        return Radius*2*Math.PI;
    }
    
    @Override
    public double Area(){ //Calculates the area
        return Radius*Radius*Pi;
    }
    
    
}
