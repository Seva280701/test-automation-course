package com.bootcampexcercise.module10.activity;

/**
 * Class: Car
 *
 * This class implements Vehicle interface
 * and provides car-specific start and stop behavior.
 *
 */
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}