/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        String letterChoice;

        // take input
        System.out.println("[C] Circle\t[R] Rectangle\t[S] Square\t[E] Exit");
        letterChoice = scanner.nextLine().toUpperCase();

        // condition
        switch (letterChoice) {
            case "C":
                System.out.println("COMPUTATION OF AREA OF A CIRCLE");
                double pi = 3.14;
                System.out.print("The value of radius: ");
                int radius = scanner.nextInt();
                double areaOfCircle = pi * radius * radius;
                System.out.println("The area of the circle is: " + areaOfCircle);
                break;
            case "R":
                System.out.println("COMPUTATION OF AREA OF A RECTANGLE");
                System.out.print("The value of length: ");
                int length = scanner.nextInt();
                System.out.print("The value of width: ");
                int width = scanner.nextInt();
                int areaOfRectangle = length * width;
                System.out.println("The area of the rectangle is: " + areaOfRectangle);
                break;
            case "S":
                System.out.println("COMPUTATION OF AREA OF A SQUARE");
                System.out.print("The value of side: ");
                int side = scanner.nextInt();
                int areaOfSquare = side * side;
                System.out.println("The area of the square is: " + areaOfSquare);
                break;
            case "E":
                System.out.println("Program terminating...");
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
                break;
        }
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
