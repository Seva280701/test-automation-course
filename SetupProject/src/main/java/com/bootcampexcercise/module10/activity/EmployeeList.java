package com.bootcampexcercise.module10.activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Class: EmployeeList
 *
 * This class creates a list of employees
 * and finds the employee with the highest salary.
 *
 * output
 *
 *The employee whose salary is the highest is: E
 *
 */
public class EmployeeList {

    public static void main(String[] args) {

        // create list of employees
        List<Employee> list = new ArrayList<>();

        // add 5 employees to list
        list.add(new Employee("A", 25, "Dev", "X", 3000));
        list.add(new Employee("B", 26, "QA", "Y", 4000));
        list.add(new Employee("C", 27, "Dev", "Z", 6000));
        list.add(new Employee("D", 28, "QA", "X", 3500));
        list.add(new Employee("E", 29, "Manager", "Y", 7000));

        // print employee with highest salary
        System.out.println("The employee whose salary is the highest is: " + getHighestPaidEmp(list));
    }

    // method to find employee with highest salary
    public static String getHighestPaidEmp(List<Employee> list) {

        // assume first employee has highest salary
        Employee max = list.get(0);

        // compare salaries
        for (Employee e : list) {
            if (e.getSalary() > max.getSalary()) {
                max = e;
            }
        }

        // return name of highest paid employee
        return max.getName();
    }
}