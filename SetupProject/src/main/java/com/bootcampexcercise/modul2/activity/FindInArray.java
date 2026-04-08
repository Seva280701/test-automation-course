package com.bootcampexcercise.modul2.activity;

public class FindInArray {

    public static void main(String[] args) {

        // create array of 20 numbers
        int[] numbers = {
                5, 12, 7, 89, 34, 23, 90, 11, 45, 67,
                2, 78, 56, 100, 3, 9, 88, 44, 21, 60
        };

        // assume first element is the largest
        int largest = numbers[0];

        // loop through array starting from second element
        for (int i = 1; i < numbers.length; i++) {

            // compare current number with largest
            if (numbers[i] > largest) {

                // update largest if current number is bigger
                largest = numbers[i];
            }
        }

        // print the result
        System.out.println("Largest number is: " + largest);
    }
}