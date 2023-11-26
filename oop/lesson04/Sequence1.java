/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class Sequence1 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        int prelimGrade, midtermGrade, finalsGrade;
        double totalGrade, averageGrade;

        // take input
        System.out.println("COMPUTE THE FINAL GRADE AVERAGE\n\n");
        System.out.print("Enter grade for prelim: ");
        prelimGrade = scanner.nextInt();
        System.out.print("Enter grade for Midterm: ");
        midtermGrade = scanner.nextInt();
        System.out.print("Enter grade for Finals: ");
        finalsGrade = scanner.nextInt();
        
        // calculate
        totalGrade = prelimGrade + midtermGrade + finalsGrade;
        averageGrade = totalGrade / 3.0;

        // output
        System.out.println("\nThe grade for prelim is " + prelimGrade);
        System.out.println("\nThe grade for midterm is " + midtermGrade);
        System.out.println("\nThe Total grade is: " + totalGrade);
        System.out.println("\n\nThe Final Grade Average is: " + averageGrade);
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
