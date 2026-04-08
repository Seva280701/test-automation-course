package com.bootcampexcercise.modul2.activity;

public class MultiplicationTable {

    public static void main(String[] args) {

        // outer loop for numbers 11 to 20
        for (int i = 11; i <= 20; i++) {

            System.out.println("Table of " + i);

            // inner loop for multiplication (1 to 10)
            for (int j = 1; j <= 10; j++) {

                // print multiplication result
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // empty line for readability
            System.out.println();
        }
    }
}