/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson06;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        String[] termNames = {
            "Prelim",
            "Midterm",
            "Finals",
        };
        String[] studentNames = new String[3];
        Double[][] studentGrades = new Double[3][3];

        // Main Loop
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Name: ");
            studentNames[i] = scanner.nextLine();
            Double studentAverage = 0.0;
            for (int j = 0; j < studentGrades.length; j++) {
                System.out.printf("%s: ", termNames[j]);
                studentGrades[i][j] = Double.valueOf(scanner.nextLine());
                studentAverage += studentGrades[i][j];
            }
            studentAverage /= 3;
            System.out.printf("\nAverage: %.1f\n\n", studentAverage);
        }

        // Program ran successfully
        scanner.close();
    }
}
