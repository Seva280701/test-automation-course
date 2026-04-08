package com.bootcampexcercise.modul2.activity;

public class AddWholeNum {

    public static void main(String[] args) {

        // initialize sum
        int sum = 0;

        // loop from 50 to 100
        for (int i = 50; i <= 100; i++) {

            // add each number to sum
            sum = sum + i;
        }

        // print result
        System.out.println("Sum of numbers from 50 to 100 is " + sum);
    }
}