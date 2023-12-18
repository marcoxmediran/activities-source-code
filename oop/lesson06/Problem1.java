/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson06;

public class Problem1 {
    public static void main(String[] args) {
        // Declare variables
        String[] names = {
            "Marygin",
            "Sammy",
            "CJay",
            "CJoy",
            "Christle",
        };

        // Loop
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d. %s\n", i, names[i]);
        }
    }
}
