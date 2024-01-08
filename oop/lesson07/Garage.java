/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

//package mmediran.oop.lesson07;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars;

    public Garage() {
        this.cars = new ArrayList<>();
    }    

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void findByMake(String make) {
        for (Car car: this.cars) {
            if (car.getMake().equals(make)) {
                System.out.println(car);
            }
        }
    }
    
    public void findByModel(String model) {
        for (Car car: this.cars) {
            if (car.getModel().equals(model)) {
                System.out.println(car);
            }
        }
    }

    public void findByYear(int year) {
        for (Car car: this.cars) {
            if (car.getYear() == year) {
                System.out.println(car);
            }
        }
    }

    public void getCars() {
        if (this.cars.isEmpty()) {
            System.out.println("Garage empty...");
            return;
        }
        System.out.println("Current cars:");
        for (Car car: this.cars) {
            System.out.println(car);
        }
    }
}
