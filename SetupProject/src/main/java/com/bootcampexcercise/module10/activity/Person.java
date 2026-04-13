package com.bootcampexcercise.module10.activity;

/**
 * Class: Person
 *
 * This is an abstract class that represents a person.
 * It stores common attributes like name and age.
 * Child classes must implement the introduce() method.
 *
 */
public abstract class Person {

    // common attributes
    protected String name;
    protected int age;

    // getter for name
    public String getName() {
        return name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // abstract method to be implemented by child classes
    public abstract void introduce();
}