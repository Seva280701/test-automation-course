package com.bootcampexcercise.modul2.activity;

public class activity7_PrintNumWithWhile {

    public static void main(String[] args) {

        int num = 1; // start from 1

        while (num < 100) {

            if (num % 2 != 0) { // check if number is odd
                System.out.println(num);
            }

            num++; // increment to avoid infinite loop
        }
    }
}