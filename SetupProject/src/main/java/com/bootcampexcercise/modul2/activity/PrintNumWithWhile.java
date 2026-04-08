package com.bootcampexcercise.modul2.activity;

public class PrintNumWithWhile {

    public static void main(String[] args) {

        // start from 1
        int num = 1;

        // loop until number is less than 100
        while (num < 100) {

            // check if number is odd
            if (num % 2 != 0) {
                System.out.println(num);
            }

            // increment number
            num++;
        }
    }
}