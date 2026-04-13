package com.bootcampexcercise.module10.activity;

/**
 * Class: InterfaceActivity
 *
 * This class creates Bike and Car objects
 * using Vehicle interface and calls their methods.
 *
 * output
 *
 * Bike started
 * Bike stopped
 * ---------------
 * Car started
 * Car stopped
 *
 */
public class InterfaceActivity {

    public static void main(String[] args) {

        // create bike object using interface
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("---------------");

        // create car object using interface
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}