package com.bootcampexcercise.module5.activity;

/**
 * Rectangle class
 */
public class Rectangle extends Shape {

    double length = 5;
    double width = 3;

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}