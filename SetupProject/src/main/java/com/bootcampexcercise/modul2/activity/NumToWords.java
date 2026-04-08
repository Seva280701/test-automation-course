package com.bootcampexcercise.modul2.activity;

public class NumToWords {

    public static void main(String[] args) {

        // call method with different values
        switchCaseEx(5);
        switchCaseEx(100);
        switchCaseEx(1);
    }

    // method to convert number to word
    public static void switchCaseEx(int num) {

        switch (num) {

            // match numbers from 1 to 10
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;

            // default case if number is out of range
            default:
                System.out.println("Given value is not in the range 1-10");
        }
    }
}