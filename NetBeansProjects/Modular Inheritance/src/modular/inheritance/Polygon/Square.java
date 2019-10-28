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
public class Square extends Polygon {
    public double SquareArea(double sideA){ //Calculates the square's area
        return sideA*sideA;
    }
    
    public double SquarePerimeter(double sideA){ //Calculates the squares perimeter
        return sideA*4;
    }
}
