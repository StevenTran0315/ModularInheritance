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
public class Quadrilateral extends Shape{
    double length;
    double height;
    double base;
    
    
    public double SquareArea(double sideA){ //Calculates the square's area
        return sideA*sideA;
    }
    
    public double SquarePerimeter(double sideA){ //Calculates the squares perimeter
        return sideA*4;
    }
    
    public double RectangleArea(double sideA, double sideB){ //Calculates the rectangles perimeter
        return sideA*sideB;
    }
    
    public double RectanglePerimeter(double sideA, double sideB){ //calculates the rectangles perimeter
        return 2*(sideA+sideB);
    }
    
}
