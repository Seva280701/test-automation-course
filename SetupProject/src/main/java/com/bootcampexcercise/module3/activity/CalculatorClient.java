package com.bootcampexcercise.module3.activity;

/**
 * Calculator Client class - used to test Calculator logic
 */

public class CalculatorClient {

    public static void main(String[] args) {

        Calculator calc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Using " + calc.getCalculatorType() + " calculator ***");

        // Add
        int result = calc.add(4, 5);
        System.out.println("Add result: " + result);

        // Multiply
        int[] arr = {2, 3, 4};
        result = calc.multiply(arr);
        System.out.println("Multiply result: " + result);

        // Divide
        result = calc.divide(10, 2);
        System.out.println("Divide result: " + result);

        // Subtract
        result = calc.subtract(10, 2);
        System.out.println("Subtract result: " + result);
    }
}