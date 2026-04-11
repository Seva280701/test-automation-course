package com.bootcampexcercise.module5.activity;

/**
 * Rectangle class
 */
public class Rectangle extends Shape {

    public double length;
    public double breadth;

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}