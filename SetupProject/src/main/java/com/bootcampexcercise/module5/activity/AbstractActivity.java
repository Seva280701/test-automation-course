package com.bootcampexcercise.module5.activity;

/**
 * Main class
 *
 *
 *
 * output
 *
 * Rectangle color: Red
 * Rectangle area: 15.0
 * Rectangle perimeter: 16.0
 * -------------------------
 * Circle color: Blue
 * Circle area: 50.26548245743669
 * Circle perimeter: 25.132741228718345
 *
 */

public class AbstractActivity {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.length = 5;
        rectangle.breadth = 3;

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.radius = 4;

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
}