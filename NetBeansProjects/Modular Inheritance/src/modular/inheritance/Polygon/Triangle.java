/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance.Polygon;

/**
 *
 * @author liamu
 */
public class Triangle extends Polygon{
    public static double base;
    public static double height;
    public static double sideA;
    public static double sideB;
    
    public double TriangleArea(double Base, double Height){ //Calculates the area
        return (Base*Height)/2;
    }
    
    public double TrianglePerimeter(double sideA, double sideB, double sideC){ //calculates the perimeter
        return sideA+sideB+sideC;
    }
   
}
