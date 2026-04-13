package com.bootcampexcercise.module8.activity;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Class: StudentTest
 *
 * This class contains tests for StudentArrayList activity.
 *
 * @author Seva
 */
public class StudentTest {

    @Test
    public void testAddStudent() {
        ArrayList<Student> students = new ArrayList<>();
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        assertEquals(1, students.size());
    }

    @Test
    public void testDuplicateStudentId() {
        ArrayList<Student> students = new ArrayList<>();
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        StudentArrayList.addStudent(students, new Student(1, "Mike", 90.0));
        assertEquals(1, students.size());
    }

    @Test
    public void testRemoveStudentById() {
        ArrayList<Student> students = new ArrayList<>();
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        StudentArrayList.addStudent(students, new Student(2, "Anna", 91.0));

        StudentArrayList.removeStudentById(students, 1);

        assertEquals(1, students.size());
        assertEquals(2, students.get(0).getId());
    }

    @Test
    public void testFindHighestGradeStudent() {
        ArrayList<Student> students = new ArrayList<>();
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        StudentArrayList.addStudent(students, new Student(2, "Anna", 91.0));
        StudentArrayList.addStudent(students, new Student(3, "Sara", 95.0));

        Student highest = StudentArrayList.findHighestGradeStudent(students);

        assertEquals(3, highest.getId());
        assertEquals("Sara", highest.getName());
    }

    @Test
    public void testFindHighestGradeStudentEmptyList() {
        ArrayList<Student> students = new ArrayList<>();
        Student highest = StudentArrayList.findHighestGradeStudent(students);
        assertNull(highest);
    }
}