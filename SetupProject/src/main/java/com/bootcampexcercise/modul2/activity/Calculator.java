package com.bootcampexcercise.modul2.activity;

/**
 *
 * This class demonstrates basic arithmetic operations
 * using methods: sum, subtract, multiply, divide, and modulus.
 *
 */
public class Calculator {

    public static void main(String[] args) {

        // calling all methods
        sum(10, 5);
        subtract(10, 5);
        multiply(10, 5);
        divide(10, 5);
        modulus(10, 5);
    }

    // addition
    public static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // subtraction
    public static void subtract(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }

    // multiplication
    public static void multiply(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }

    // division
    public static void divide(int a, int b) {
        System.out.println("Divide: " + (a / b));
    }

    // modulus (remainder)
    public static void modulus(int a, int b) {
        System.out.println("Modulus: " + (a % b));
    }
}