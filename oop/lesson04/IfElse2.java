/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        int inputInteger;

        // take input
        System.out.print("Give me an integer: ");
        inputInteger = scanner.nextInt();

        // condition
        if (inputInteger % 2 == 0) {
            System.out.println(inputInteger + " is even.");
        } else {
            System.out.println(inputInteger + " is odd.");
        }
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
