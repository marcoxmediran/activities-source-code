/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson04;

import java.util.Scanner;

public class IfElse3 {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        String customerName, purchasedItem;
        int quantity;
        double cash, price, bill, change;

        // take input
        System.out.print("Customer name: ");
        customerName = scanner.nextLine();
        System.out.print("Purchased Item: ");
        purchasedItem = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Price: ");
        price = scanner.nextDouble();
        bill = price * quantity;
        System.out.println("Total Price is: " + bill);
        System.out.print("Cash: ");
        cash = scanner.nextDouble();

        // condition
        if (bill >= 1000) {
            bill *= 0.7;
            System.out.println("The Total Bill is: " + bill);
        } else {
            System.out.println("The Total Bill is: " + bill);
        }
        change = cash - bill;
        System.out.println("The Change is: " + change);
        
        // program ran successfully
        scanner.close();
        System.exit(0);
    }
    
}
