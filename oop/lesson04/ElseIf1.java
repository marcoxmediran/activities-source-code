/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class ElseIf1 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        int grade;

        // take input
        System.out.print("Enter a grade: ");
        grade = scanner.nextInt();

        // condition
        System.out.print(" Your grade is ");
        if (grade >= 99) {
            System.out.println("1.00");
        } else if (grade >= 96) {
            System.out.println("1.25");
        } else if (grade >= 93) {
            System.out.println("1.50");
        } else if (grade >= 90) {
            System.out.println("1.75");
        } else if (grade >= 87) {
            System.out.println("2.00");
        } else if (grade >= 84) {
            System.out.println("2.25");
        } else if (grade >= 81) {
            System.out.println("2.50");
        } else if (grade >= 77) {
            System.out.println("2.75");
        } else if (grade >= 75) {
            System.out.println("3.00");
        } else {
            System.out.println("5.00");
        }
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
