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
        static double sideLength;
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
        Quadrilateral Square = new Quadrilateral(); // A new square is instatiated
        Quadrilateral Rectangle = new Quadrilateral(); //new Rectangle is instatiated
        
        switch(QuadType){ //switch case to determine square or rectangle and only allows inputs of 0 or 1
            case 0: //Square
                Square.length = getSideLength("What is the side length of the square? "); //Asks the user for the side length
                OutputCalc("Square",Square.SquarePerimeter(Square.length), Square.SquareArea(Square.length)); //Calculates the area and perimeter and outputs
                break;
            case 1:
                Rectangle.base = getSideLength("What is the base length of the rectangle? "); //Asks for the base
                Rectangle.height = getSideLength("What is the height of the rectangle? "); //Asks for the height
                OutputCalc("Rectangle",Rectangle.RectanglePerimeter(Rectangle.base, Rectangle.height),Rectangle.RectangleArea(Rectangle.base, Rectangle.height)); //Calculates the area and perimeter and outputs
                break;
            default:
                break;
        }
    }
    
    private static void RunTriangle(){ //Runs the triangle calculations
        Triangle triangle = new Triangle(); //Creates a new triangle
        
        triangle.base = getSideLength("What is the base length of the triangle? "); //Asks for the base for the area
        triangle.height = getSideLength("What is the height of the triangle? "); //Asks for the height for the area
        triangle.sideA = getSideLength("What is one side length (not base) of the triangle? "); //Asks for a second side length
        triangle.sideB = getSideLength("What is another side length (not base) of the triangle? "); //Asks for the last side length
        
        OutputCalc("Triangle",triangle.TrianglePerimeter(triangle.sideA, triangle.sideB, triangle.base),triangle.TriangleArea(triangle.base, triangle.height));//Calculates the area and perimeter and outputs
    }
    
    private static double getSideLength(String question){ //Method to get a side length when a question is inputted
        System.out.print(question); //prints the question
        while(true){ //loops until valid answer is inputted
            try{
                sideLength = sc.nextDouble(); //trys to get a double
                break;
             }
             catch(InputMismatchException err){ //if input is invalid they try again
                sc.next();
                System.out.println("Not a valid Choice. Please try again.");
             }
        }
        return sideLength; //returns the valid input given
    }
    private static void OutputCalc(String Shape, double P, double A){ //Outputs the perimeter and area of the shape provided
        System.out.printf("The %s's perimeter is %.2f units.\nThe area is %.2f.\n", Shape, P, A); //prints it out
    }


    public static void main(String[] args) {
        // TODO code application logic here
      ChooseShape();  //starts at choose shape
    }
}

