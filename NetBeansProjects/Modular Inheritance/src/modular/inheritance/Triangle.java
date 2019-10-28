/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance;

/**
 *
 * @author liamu
 */
public class Triangle extends Shape{
    double base;
    double height;
    double sideA;
    double sideB;
    
    public double TriangleArea(double Base, double Height){ //Calculates the area
        return (Base*Height)/2;
    }
    
    public double TrianglePerimeter(double sideA, double sideB, double sideC){ //calculates the perimeter
        return sideA+sideB+sideC;
    }
   
}
