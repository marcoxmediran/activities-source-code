/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

//package mmediran.oop.lesson07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Object Instantiation
        Garage myGarage = new Garage();
        UserInterface ui = new UserInterface(myGarage, scanner);

        // Object Functions
        ui.start();
        
    }
}
