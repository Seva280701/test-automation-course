package com.bootcampexcercise.module10.activity;

/**
 * Class: Student
 *
 * This class extends Person and represents a student.
 * It stores the university or school name.
 *
 *
 */
public class Student extends Person {

    // student-specific attribute
    private String schoolName;

    // constructor
    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    // getter
    public String getSchoolName() {
        return schoolName;
    }

    // setter
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // override introduce method
    @Override
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println("I study in university " + schoolName);
    }
}