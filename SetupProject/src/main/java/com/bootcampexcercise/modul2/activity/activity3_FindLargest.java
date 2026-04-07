package com.bootcampexcercise.modul2.activity;

public class activity3_FindLargest {

    public static void main(String[] args) {

        int x = 10;
        int y = 88;
        int z = 2;

        int largest;

        if (x >= y && x >= z) {
            largest = x;
        } else if (y >= x && y >= z) {
            largest = y;
        } else {
            largest = z;
        }

        System.out.println("Largest number is: " + largest);
    }
}