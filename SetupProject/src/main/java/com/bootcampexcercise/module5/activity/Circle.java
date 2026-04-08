package com.bootcampexcercise.module5.activity;

/**
 * Circle class
 */

public class Circle extends Shape {

    double radius = 4;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}