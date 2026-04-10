import com.bootcampexcercise.module8.activity.Student;
import com.bootcampexcercise.module8.activity.StudentArrayList;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Class: StudentTest
 *
 * This class contains unit tests for StudentArrayList activity.
 *
 *
 */
public class StudentTest extends TestCase {

    private ArrayList<Student> students;

    protected void setUp() {
        students = new ArrayList<>();
    }

    protected void tearDown() {
        students = null;
    }

    // Test 1: add student successfully
    public void testAddStudent() {
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        assertEquals(1, students.size());
    }

    // Test 2: prevent duplicate ID
    public void testDuplicateStudentId() {
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        StudentArrayList.addStudent(students, new Student(1, "Mike", 90.0));
        assertEquals(1, students.size());
    }

    // Test 3: remove student by ID
    public void testRemoveStudentById() {
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        StudentArrayList.addStudent(students, new Student(2, "Anna", 91.0));

        StudentArrayList.removeStudentById(students, 1);

        assertEquals(1, students.size());
        assertEquals(2, students.get(0).getId());
    }

    // Test 4: find highest grade student
    public void testFindHighestGradeStudent() {
        StudentArrayList.addStudent(students, new Student(1, "John", 85.5));
        StudentArrayList.addStudent(students, new Student(2, "Anna", 91.0));
        StudentArrayList.addStudent(students, new Student(3, "Sara", 95.0));

        Student highest = StudentArrayList.findHighestGradeStudent(students);

        assertEquals(3, highest.getId());
        assertEquals("Sara", highest.getName());
    }

    // Test 5: empty list returns null
    public void testFindHighestGradeStudentEmptyList() {
        Student highest = StudentArrayList.findHighestGradeStudent(students);
        assertNull(highest);
    }
}