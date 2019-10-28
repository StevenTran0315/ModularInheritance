/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.inheritance;
import modular.inheritance.Circle.*;
import modular.inheritance.Polygon.*;
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
        static int QuadrilateralType;
    /**
     * @param args the command line arguments
     */
        
    private static void ChoosePolygon(){ //Allows the user to choose what type of polygon to calculate
        while(0==0){ //loops until a valid integer is entered.
            
            System.out.println("What shape do you want to calculate? "); // Asks the user what shape they want and displays their options
            System.out.println("0 : Exit \n1 : Quadrilateral\n2 : Triangle");

            try{
                PolyType = sc.nextInt(); //try to take an integer input

                switch(PolyType){ //switch case to choose what polygon and only allows inputs of 0 or 1
                    case 0:
                        System.exit(0); //exits the code
                        break;
                    case 1://Sends the user to choose a quadrilateral
                        ChooseQuadrilateral();
                        break;
                    case 2: //Goes and runs the triangle code
                        RunTriangle();
                        break;
                    default://All other choices are invalid
                        System.out.println("Invalid. Try again");
                        break;
               }
            }
            catch(InputMismatchException err){ //if not a valid integer, states its invalid and trys again
                        sc.next();
                        System.out.println("Not a valid Choice. Please try again.");
            }
        }
    }    
        
    private static void RunCircle(){ //Runs the circle calculations
        Circle circle = new Circle(); //creates new circle
        
        circle.GetRadius(); //user enters in the radius
        OutputCalc("Circle",circle.Circumference(),circle.Area()); //calculates the area and perimeter and outputs it

    }
    
    private static void ChooseShape(){ //User chooses whether they want a circle or a polygon

        while (0==0){ //loops until a valid Shape is inputted
           System.out.println("Is your shape a polygon '0' or circle '1'."); //Asks the user the question
           try{
                ShapeType = sc.nextInt(); //trys to get a valid integer

                switch(ShapeType){ //switch case for whether the user chose circle or polygon and only allows inputs of 0 or 1
                     case 0: // runs the polygon directory
                         ChoosePolygon();
                         break;
                     case 1: // runs the circle calculations
                         RunCircle();
                         break;
                     default: //if invalid they try again
                         System.out.println("Invalid. Try again");
                         break;
                }
           }
           catch(InputMismatchException err){ //if an invalid integer is inputted, it tells them its invalid and trys again.
               sc.next();
               System.out.println("Not a valid Choice. Please try again.");
           }
        }

    }
    
    private static void ChooseQuadrilateral(){ //Chooses what type of quadrilateral the user wants
        while(0==0){ //loops until a valid input is chosen
        System.out.println("Is your shape a square '0' or a rectangle/parallelogram '1'?"); //asks user the question
        try{
            QuadType = sc.nextInt(); //try to get a valid integer input
            switch(QuadType){ //switch case to only allows inputs of 0 or 1
                         case 0:
                             RunSquare(); //runs square if a valid input is entered
                             break;
                         case 1:
                             RunSquare();
                             break;

                         default:
                             System.out.println("Invalid. Try again"); //If invalid try again
                             break;
                     }
         }
         catch(InputMismatchException err){//If invalid try again
            sc.next();
            System.out.println("Not a valid Choice.");
         }  
        }
    }
    
    private static void RunSquare(){
        Square square = new Square(); // A new square is instatiated
        Rectangle rectangle = new Rectangle(); //new Rectangle is instatiated
        
        switch(QuadType){ //switch case to determine square or rectangle and only allows inputs of 0 or 1
            case 0: //Square
                square.length = square.getSideLength("What is the side length of the square? "); //Asks the user for the side length
                OutputCalc("Square",square.SquarePerimeter(Square.length), square.SquareArea(Square.length)); //Calculates the area and perimeter and outputs
                break;
            case 1:
                rectangle.base = rectangle.getSideLength("What is the base length of the rectangle? "); //Asks for the base
                rectangle.height = rectangle.getSideLength("What is the height of the rectangle? "); //Asks for the height
                OutputCalc("Rectangle",rectangle.RectanglePerimeter(Rectangle.base, Rectangle.height),rectangle.RectangleArea(Rectangle.base, Rectangle.height)); //Calculates the area and perimeter and outputs
                break;
            default:
                break;
        }
    }
    
    private static void RunTriangle(){ //Runs the triangle calculations
        Triangle triangle = new Triangle(); //Creates a new triangle
        
        triangle.base = triangle.getSideLength("What is the base length of the triangle? "); //Asks for the base for the area
        triangle.height = triangle.getSideLength("What is the height of the triangle? "); //Asks for the height for the area
        triangle.sideA = triangle.getSideLength("What is one side length (not base) of the triangle? "); //Asks for a second side length
        triangle.sideB = triangle.getSideLength("What is another side length (not base) of the triangle? "); //Asks for the last side length
        
        OutputCalc("Triangle",triangle.TrianglePerimeter(triangle.sideA, triangle.sideB, triangle.base),triangle.TriangleArea(triangle.base, triangle.height));//Calculates the area and perimeter and outputs
    }
    
  
    private static void OutputCalc(String Shape, double P, double A){ //Outputs the perimeter and area of the shape provided
        System.out.printf("The %s's perimeter is %.2f units.\nThe %s's area is %.2f units squared.\n", Shape, P, Shape, A); //prints it out
    }


    public static void main(String[] args) {
        // TODO code application logic here
      ChooseShape();  //starts at choose shape
    }
}

