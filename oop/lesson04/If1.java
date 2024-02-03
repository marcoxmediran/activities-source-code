/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class If1 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        String grade;

        // take input
        System.out.print("Enter a grade: ");
        grade = scanner.nextLine().toUpperCase();

        // conditions
        if (grade.equals("A")) System.out.println(grade + " IS YOUR GRADE AND YOU ARE EXCELLENT");
        if (grade.equals("B")) System.out.println(grade + " IS YOUR GRADE AND YOU ARE VERY GOOD");
        if (grade.equals("C")) System.out.println(grade + " IS YOUR GRADE AND YOU ARE GOOD");
        if (grade.equals("D")) System.out.println(grade + " IS YOUR GRADE AND YOU ARE FAIR");
        if (grade.equals("E")) System.out.println(grade + " IS YOUR GRADE AND YOU ARE POOR");
        if (grade.equals("F")) System.out.println(grade + " IS YOUR GRADE AND YOU NEED IMPROVEMENT");
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
