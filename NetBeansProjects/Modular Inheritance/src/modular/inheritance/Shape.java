/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance;

/**
 *
 * @author S331461152
 */
public class Shape {
       // pretend its called shape
    
    public Shape(){
        int Shapes;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Circle extends Shape{
    
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
