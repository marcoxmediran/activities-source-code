/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

//package mmediran.oop.lesson07;

import java.util.Scanner;

public class UserInterface {
    private Garage garage;
    private Scanner scanner;

    public UserInterface(Garage garage, Scanner scanner) {
        this.garage = garage;
        this.scanner = scanner;
    }

    public void start() {
        printGreetings();
        printMenu();

        while (true) {
            System.out.println();
            System.out.print("Choice: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Make: ");
                    String make = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Year: ");
                    int year = Integer.valueOf(scanner.nextLine());

                    Car newCar = new Car(make, model, year);
                    garage.addCar(newCar);
                    System.out.println("New car added...");
                    break;
                case "2":
                    System.out.print("Make: ");
                    String makeKeyword = scanner.nextLine();
                    this.garage.findByMake(makeKeyword);
                    break;
                case "3":
                    System.out.print("Model: ");
                    String modelKeyword = scanner.nextLine();
                    this.garage.findByModel(modelKeyword);
                    break;
                case "4":
                    System.out.print("Year: ");
                    int yearKeyword = Integer.valueOf(scanner.nextLine());
                    this.garage.findByYear(yearKeyword);
                    break;
                case "5":
                    this.garage.getCars();
                    break;
                case "6":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong input.");
                    break;
            }
        }
    }

    public void printGreetings() {
        System.out.println("Welcome to Marcox's garage!");
    }

    public void printMenu() {
        System.out.println();
        System.out.println("[1] Add a car");
        System.out.println("[2] Find car by Make");
        System.out.println("[3] Find car by Model");
        System.out.println("[4] Find car by Year");
        System.out.println("[5] List all cars");
        System.out.println("[6] Exit");
    }
    
}
