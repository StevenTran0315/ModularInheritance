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
        static boolean area;
    
    /**
     * @param args the command line arguments
     */
        
    private static void ChoosePolygon(){
        System.out.print("What shape  do you want to calculate? ");
        
        System.out.println("0 : Exit");
        System.out.println("1 : Quadrilateral");
        System.out.println("2 : Triangle");

        while(0==0){
        PolyType = sc.nextInt();
             
            switch(ShapeType){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    //Quad
                    break;
                case 2:
                    //triangle stuff
                    break;
                default:
                    System.out.println("Invalid. Try again");
                    break;
           }
        }
    }    
        
    private static void RunCircle(){
        Circle Acircle = new Circle();
        Circle Pcircle = new Circle();
        
        switch(CalcType){
            case 0: //area
                Acircle.GetRadius();
                OutputA("Circle",Acircle.Area());
                break;
            case 1: //perimeter
                Pcircle.GetRadius();
                OutputP("Circle", Pcircle.Circumference());
                break;
            default:
                break;
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
                case 1:
                    RunCircle();
                    break;
              
                default:
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
         catch(InputMismatchException err){
            sc.next();
            System.out.println("Not a valid Choice.");
         }  
        }
        
        ChooseShape();
       
        
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

