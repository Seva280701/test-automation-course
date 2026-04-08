package com.bootcampexcercise.module3.activity;

/**
 *
 * This class performs basic mathematical operations.
 */


public class Calculator {

    // constant (type of calculator)
    public static final String CALC_TYPE_BASIC = "BASIC";

    private String calculatorType;

    // constructor
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // getter
    public String getCalculatorType() {
        return calculatorType;
    }

    // add
    public int add(int a, int b) {
        return a + b;
    }

    // subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    // divide
    public int divide(int a, int b) {
        return a / b;
    }

    // multiply (array)
    public int multiply(int[] numbers) {
        int result = 1;

        for (int num : numbers) {
            result = result * num;
        }

        return result;
    }
}