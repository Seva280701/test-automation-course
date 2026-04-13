package com.bootcampexcercise.module10.activity;

/**
 * Class: Employee
 *
 * This class extends Person and represents an employee.
 * It stores job title, company and salary.
 *
 */
public class Employee extends Person {

    // employee-specific attributes
    private String jobTitle;
    private String company;
    private double salary;

    // constructor
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // getters
    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // override introduce method
    @Override
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }
}