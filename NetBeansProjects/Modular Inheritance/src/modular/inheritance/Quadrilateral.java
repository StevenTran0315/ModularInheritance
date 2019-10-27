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
    public double SquareArea(double sideA){
        return sideA*sideA;
    }
    
    public double SquarePerimeter(double sideA){
        return sideA*4;
    }
    
    public double ParallelogramArea(double sideA, double sideB){
        return sideA*sideB;
    }
    
    public double ParallelogramPerimeter(double sideA, double sideB){
        return 2*(sideA+sideB);
    }
    
    public double RhombusArea(double sideP, double sideQ){
        return (sideP*sideQ)/2;
    }
}
