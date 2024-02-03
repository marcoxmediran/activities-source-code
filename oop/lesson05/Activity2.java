/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson05;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum multiplicand for the table: ");
        int max = Integer.valueOf(scanner.nextLine());

        // header
        System.out.print("\t");
        for (int i = 1; i <= max; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // divider
        for (int i = 0; i <= max; i++) {
            System.out.print("---------");
        }
        System.out.println();

        // rows
        for (int i = 1; i <= max; i++) {
            // cols
            System.out.print(i + "|\t");
            for (int j = 1; j <= max; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    } 
}
