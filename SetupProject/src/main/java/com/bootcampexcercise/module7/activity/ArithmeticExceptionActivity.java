package com.bootcampexcercise.module7.activity;

/**
 *
 * This class demonstrates handling ArithmeticException
 * (division by zero) using try-catch-finally blocks.
 *
 * output
 *
 * Error: Cannot divide by zero!
 * Thank you for using this program.
 * Result is: 5
 * Thank you for using this program.
 *
 */
public class ArithmeticExceptionActivity {

    /**
     * Main method
     */
    public static void main(String args[]) {

        // create object
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

        // call with error (division by zero)
        obj.catchMe(10, 0);

        // call with correct values
        obj.catchMe(10, 2);
    }

    /**
     * Method to divide two numbers and handle exception
     */
    void catchMe(int num1, int num2) {

        try {
            // division (can cause ArithmeticException)
            int result = num1 / num2;
            System.out.println("Result is: " + result);

        } catch (ArithmeticException a) {

            // handle division by zero
            System.out.println("Error: Cannot divide by zero!");

        } finally {

            // always executes
            System.out.println("Thank you for using this program.");
        }
    }
}