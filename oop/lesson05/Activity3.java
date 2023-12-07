/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson05;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // main loop
        for (String choice = "Y"; choice.equals("Y");) {
            // input
            System.out.print("Please enter Customer Name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter Purchased Item: ");
            String purchasedItem = scanner.nextLine();
            System.out.print("Please enter Quantity: ");
            int quantity = Integer.valueOf(scanner.nextLine());
            System.out.print("Please enter Price: ");
            double price = Double.valueOf(scanner.nextLine());
            System.out.print("Please enter Cash: ");
            double cash = Double.valueOf(scanner.nextLine());

            // calculations
            double bill = price * quantity;
            if (bill >= 1000) {
                // discount
                bill *= 0.70;
            }
            double change = cash - bill;

            // finisher
            System.out.println("Customer Name: " + name);
            System.out.println("Purchased Item: " + purchasedItem);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Total Bill: " + bill);
            System.out.println("Cash: " + cash);
            System.out.println("Change: " + change);
            do {
                System.out.print("Do you want to try again? Y/N: ");
                choice = scanner.nextLine();
            } while (!choice.equals("Y") && !choice.equals("N"));
        }

        scanner.close();
    }
    
}
