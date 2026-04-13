package com.bootcampexcercise.module10.activity;

/**
 * Class: AbstractActivity
 *
 * This class creates Employee and Student objects
 * and calls their introduce() methods.
 *
 * output
 *
 * My name is John and I am 30 years old.
 * I work as Developer in Google and my salary is 5000.0
 * ---------------
 * My name is Anna and I am 20 years old.
 * I study in university RTU
 *
 */
public class AbstractActivity {

    public static void main(String[] args) {

        // create employee object
        Employee emp = new Employee("John", 30, "Developer", "Google", 5000);
        emp.introduce();

        System.out.println("---------------");

        // create student object
        Student student = new Student("Anna", 20, "RTU");
        student.introduce();
    }
}