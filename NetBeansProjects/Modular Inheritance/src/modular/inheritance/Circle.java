/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance;

/**
 *
 * @author Steven
 */
public class Circle extends Shape{
    
    final double Pi = Math.PI;
    double Radius;    
    double Area;
    double Circ;
    
    double Circumference(){
        Circ = Radius*2*Math.PI;
        return Circ;
    }
    
    double Area(){
        Area = Radius*Radius*Pi;
        return Area;
    }
}
