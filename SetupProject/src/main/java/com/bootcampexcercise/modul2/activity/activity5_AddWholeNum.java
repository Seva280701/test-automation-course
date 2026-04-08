package com.bootcampexcercise.modul2.activity;

public class activity5_AddWholeNum {

    public static void main(String[] args) {

        
        int sum = 0; // initialize sum variable

        for (int i = 50; i <= 100; i++) { // loop from 50 to 100
            sum = sum + i;
        }

        System.out.println("Sum of numbers from 50 to 100 is " + sum);
    }
}
