package com.bootcampexcercise.module8.activity;

/**
 *
 * This class represents a student with id, name and grade.
 *
 */
public class Student {

    // student attributes
    private int id;
    private String name;
    private double grade;

    // constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // print student details
    public void printStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}