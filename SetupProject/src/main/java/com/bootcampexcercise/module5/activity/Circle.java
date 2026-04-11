package com.bootcampexcercise.module5.activity;

/**
 * Circle class
 */

public class Circle extends Shape {

    public double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}