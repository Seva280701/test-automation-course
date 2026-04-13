package com.bootcampexcercise.module10.activity;

/**
 * Class: Bike
 *
 * This class implements Vehicle interface
 * and provides bike-specific start and stop behavior.
 *
 *
 */
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}