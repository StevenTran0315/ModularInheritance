/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author S331461152
 */
public class Shape {
        static Scanner sc = new Scanner(System.in);
        static int ShapeType;
        static int CalcType;
        static int PolyType;
        static int QuadType;
        static boolean area;
        static int QuadrilateralType;
    /**
     * @param args the command line arguments
     */
        
    private static void ChoosePolygon(){
        System.out.print("What shape do you want to calculate? ");
        
        System.out.println("0 : Exit");
        System.out.println("1 : Quadrilateral");
        System.out.println("2 : Triangle");

        while(0==0){
        PolyType = sc.nextInt();
             
            switch(PolyType){
                case 0:
                    System.exit(0);
                    break;
                case 1://Send user to 2d shape directory
                    ChooseQuadrilateral();
                    break;
                case 2:
                    //triangle stuff
                    break;
                default://All other choices are invalid
                    System.out.println("Invalid. Try again");
                    break;
           }
        }
    }    
        
    private static void ChooseShape(){
        while (0==0){
           System.out.println("Is your shape a polygon '0' or circle '1'.");
           ShapeType = sc.nextInt();
           
           switch(ShapeType){
                case 0:
                    ChoosePolygon();
                    break;
                case 1://Send user to 2d shape directory
                    //Circle stuff
                    break;
              
                default://All other choices are invalid
                    System.out.println("Invalid. Try again");
                    break;
           }
        }
    }
    
    private static void ChooseType(){
        
        System.out.println("Do you want area '0' or perimeter '1'.");
        while(0==0){ 
        
         try{
            CalcType = sc.nextInt();
            break;
         }
         catch(InputMismatchException err){//If type error then throw an error and ask again
            sc.next();
            System.out.println("Not a valid Choice.");
         }  
        }
        
        ChooseShape();
       
        
    }
    
    private static void ChooseQuadrilateral(){
        
        System.out.println("Is your shape a sqaure '0' or a rectangle/parallelogram '1'?");
        while(0==0){ 
        
         try{
            QuadType = sc.nextInt();
            break;
         }
         catch(InputMismatchException err){//If type error then throw an error and ask again
            sc.next();
            System.out.println("Not a valid Choice.");
         }  
        }
        RunSquare();
    }
    
    private static void RunSquare(){
        Quadrilateral Square = new Quadrilateral();
        Quadrilateral Rectangle = new Quadrilateral();
        
        switch(QuadType){
            case 0:
                Square.length = getSideLength("What is the side length of the square?");
                OutputA("Square", Square.SquareArea(Square.length));
                OutputP("Square",Square.SquarePerimeter(Square.length));
                break;
            case 1:
                Rectangle.base = getSideLength("What is the base length of the rectangle?");
                Rectangle.height = getSideLength("What is the height of the rectangle?");
                OutputA("Rectangle",Rectangle.RectangleArea(Rectangle.base, Rectangle.height));
                OutputP("Rectangle",Rectangle.RectanglePerimeter(Rectangle.base, Rectangle.height));
                break;
            default:
                break;
        }
    }
    
    private static double getSideLength(String question){
        System.out.print(question);
        double sideLength = 0;
        try{
            sideLength = sc.nextDouble();
         }
         catch(InputMismatchException err){
            sc.next();
            System.out.println("Not a valid Choice.");
         }
        
        return sideLength;
    }
    private static void OutputP(String Shape, double P){
        System.out.printf("The %s 's perimeter is %.2f units.\n", Shape, P);
    }

    private static void OutputA(String Shape, double A){
        System.out.printf("The %s 's area is %.2f units squared.\n", Shape, A);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      ChooseType();  
    }
}

