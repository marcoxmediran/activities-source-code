/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

//package mmediran.oop.lesson07;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.year + " " + this.make + " " + this.model;
    }
    
}
