package com.bootcampexcercise.module3.activity;

/**
 *
 * This class creates an object of Car
 * and prints its attributes.
 *
 */
public class CarInstance {

    public static void main(String[] args) {

        // create object of Car
        Car car = new Car();

        // assign values
        car.name = "Volvo";
        car.color = "Grey";
        car.modelNo = 2006;

        // print only car name
        System.out.println("Car name: " + car.name);

        // print all attributes
        System.out.println("Car details: "
                + car.name + ", "
                + car.color + ", "
                + car.modelNo + ", S60");
    }
}