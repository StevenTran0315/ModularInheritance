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
    double sideC;
    
    public double TriangleArea(double Base, double Height){
        return (Base*Height)/2;
    }
    
    public double TrianglePerimeter(double sideA, double sideB, double sideC){
        return sideA+sideB+sideC;
    }
   
}
