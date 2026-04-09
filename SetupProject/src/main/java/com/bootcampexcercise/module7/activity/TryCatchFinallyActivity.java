package com.bootcampexcercise.module7.activity;

/**
 *
 * This class demonstrates the use of try, catch and finally blocks.
 * It intentionally causes an exception and handles it.
 *
 * output
 *
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * Error: Array index is out of bounds!
 * Finally block executed!
 *
 */

public class TryCatchFinallyActivity {

    public static void main(String[] args) {

        // call method
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            // loop with wrong condition (i <= 10)
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }

        } catch (IndexOutOfBoundsException e) {

            // custom message
            System.out.println("Error: Array index is out of bounds!");

        } finally {

            // always runs
            System.out.println("Finally block executed!");
        }
    }
}