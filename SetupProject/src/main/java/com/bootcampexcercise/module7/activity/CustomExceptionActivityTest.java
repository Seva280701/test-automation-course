package com.bootcampexcercise.module7.activity;

/**
 *
 * This class checks if user is valid using a custom exception.
 *
 *
 * output
 *
 * Welcome to Payroll program
 * You are not allowed to use this program
 *
 */
public class CustomExceptionActivityTest {

    public static void main(String[] args) {

        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        try {
            obj.validateUser("John");     // valid
            obj.validateUser("Alex");     // invalid
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        int flag = 0;

        // check if name exists in array
        for (int i = 0; i < validUsers.length; i++) {
            if (validUsers[i].equals(name)) {
                flag = 1;
            }
        }

        // if not found → throw exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }

        // if found → welcome message
        else {
            System.out.println("Welcome to Payroll program");
        }
    }
}