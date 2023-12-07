/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson05;

import java.io.*;

public class Activity1WhileLoop {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name;

        System.out.print("Enter Your Name: ");
        name = input.readLine();

        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println((i + 1) + ": " + name);
            i++;
        }

        input.close();
    }
    
}
