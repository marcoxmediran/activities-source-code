/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        String inputString;
        String passwordString = "MARCOX";

        // take input
        System.out.print("Enter your Password: ");
        inputString = scanner.nextLine();

        // condition
        if (inputString.equals(passwordString)) {
            System.out.println("Your password is granted: " + inputString);
        } else {
            System.out.println("Your password is denied: " + inputString);
        }
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
