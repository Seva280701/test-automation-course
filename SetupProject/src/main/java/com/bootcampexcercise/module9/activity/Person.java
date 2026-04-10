package com.bootcampexcercise.module9.activity;

/**
 * Class: Person
 *
 * This class represents a person and calculates BMI.
 *
 * @author Seva
 */
public class Person {

    private int weight;     // in kg
    private float height;   // in meters

    // getters and setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Method to calculate BMI
     */
    public String getBodyMassIndex(float height, int weight) {

        // validation checks
        if (height <= 0 || weight <= 0) {
            return "Invalid input: height and weight must be greater than 0";
        }

        if (height > 3 || weight > 500) {
            return "Invalid input: unrealistic values";
        }

        float bmi = weight / (height * height);

        // simple BMI categories
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}