/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance.Polygon;

/**
 *
 * @author Steven
 */
public class Rectangle extends Polygon{
    public double RectangleArea(double sideA, double sideB){ //Calculates the rectangles perimeter
        return sideA*sideB;
    }
    
    public double RectanglePerimeter(double sideA, double sideB){ //calculates the rectangles perimeter
        return 2*(sideA+sideB);
    }
}
