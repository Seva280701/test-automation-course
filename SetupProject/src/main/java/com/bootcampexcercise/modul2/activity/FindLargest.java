package com.bootcampexcercise.modul2.activity;

/**
 *
 * This class compares three integer values
 * and finds the largest among them using if-else statements.
 *
 */

public class FindLargest {

    public static void main(String[] args) {

        // declare three numbers
        int x = 10;
        int y = 88;
        int z = 2;

        int largest;

        // check which number is largest
        if (x >= y && x >= z) {
            largest = x;
        } else if (y >= x && y >= z) {
            largest = y;
        } else {
            largest = z;
        }

        // print result
        System.out.println("Largest number is: " + largest);
    }
}