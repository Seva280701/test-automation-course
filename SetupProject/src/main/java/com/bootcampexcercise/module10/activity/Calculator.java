package com.bootcampexcercise.module10.activity;

/**
 * Class: Calculator
 *
 * This class performs basic mathematical operations.
 * It also demonstrates method overloading and exception handling.
 *
 *
 */
public class Calculator {

    // overloaded add method with 2 parameters
    public int add(int a, int b) {
        return a + b;
    }

    // overloaded add method with 3 parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // divide method with try-catch
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    // multiply method with custom validation
    public int multiply(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Invalid input");
        }
        return a * b;
    }
}