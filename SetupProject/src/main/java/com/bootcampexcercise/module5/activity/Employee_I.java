package com.bootcampexcercise.module5.activity;

/**
 * Child class (inherits Person_I)
 */
public class Employee_I extends Person_I {

    String title;
    double salary;

    // method to display employee info
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Title: " + title);
        System.out.println("Salary: " + salary);
    }
}