package com.bootcampexcercise.modul2.activity;

public class activity6_MultiplicationTable {

    public static void main(String[] args) {

        // print tables from 11 to 20
        for (int i = 11; i <= 20; i++) {

            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // empty line between tables
        }
    }
}