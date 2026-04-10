package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;

/**
 *
 *
 * This class demonstrates how to use ArrayList with Student objects.
 * It adds, removes, prints students and finds the highest grade.
 *
 * output
 *
 * Student with ID 2 already exists.
 * All Students:
 * ID: 1, Name: John, Grade: 85.5
 * ID: 2, Name: Anna, Grade: 91.0
 * ID: 3, Name: Mike, Grade: 78.5
 * ID: 4, Name: Sara, Grade: 95.0
 *
 * Student with ID 3 removed.
 *
 * After removing student with ID 3:
 * ID: 1, Name: John, Grade: 85.5
 * ID: 2, Name: Anna, Grade: 91.0
 * ID: 4, Name: Sara, Grade: 95.0
 *
 * Student with highest grade:
 * ID: 4, Name: Sara, Grade: 95.0
 *
 */
public class StudentArrayList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // add students
        addStudent(students, new Student(1, "John", 85.5));
        addStudent(students, new Student(2, "Anna", 91.0));
        addStudent(students, new Student(3, "Mike", 78.5));
        addStudent(students, new Student(4, "Sara", 95.0));

        // try duplicate ID
        addStudent(students, new Student(2, "Alex", 88.0));

        // print all students
        System.out.println("All Students:");
        printAllStudents(students);

        // remove student by ID = 3
        removeStudentById(students, 3);

        // print after remove
        System.out.println("\nAfter removing student with ID 3:");
        printAllStudents(students);

        // find highest grade student
        System.out.println("\nStudent with highest grade:");
        Student topStudent = findHighestGradeStudent(students);
        if (topStudent != null) {
            topStudent.printStudent();
        }
    }

    // add student, prevent duplicate ID
    public static void addStudent(ArrayList<Student> students, Student newStudent) {
        for (Student student : students) {
            if (student.getId() == newStudent.getId()) {
                System.out.println("Student with ID " + newStudent.getId() + " already exists.");
                return;
            }
        }
        students.add(newStudent);
    }

    // remove student by ID
    public static void removeStudentById(ArrayList<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("\nStudent with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("\nStudent with ID " + id + " not found.");
    }

    // print all students
    public static void printAllStudents(ArrayList<Student> students) {
        for (Student student : students) {
            student.printStudent();
        }
    }

    // find student with highest grade
    public static Student findHighestGradeStudent(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return null;
        }

        Student highest = students.get(0);

        for (Student student : students) {
            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }

        return highest;
    }
}