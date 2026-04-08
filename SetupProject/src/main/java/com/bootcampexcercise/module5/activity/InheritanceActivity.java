package com.bootcampexcercise.module5.activity;

/**
 * Calling class
 */
public class InheritanceActivity {

    public static void main(String[] args) {

        // Person object
        Person_I myPerson = new Person_I();
        myPerson.name = "Sarah Johnson";
        myPerson.age = 21;

        myPerson.displayPerson();

        System.out.println("-----------------------------");

        // Employee object
        Employee_I myEmployee = new Employee_I();
        myEmployee.name = "Shawn Cun";
        myEmployee.age = 32;
        myEmployee.title = "Developer";
        myEmployee.salary = 70000.00;

        myEmployee.displayEmployee();

        System.out.println("-----------------------------");
    }
}