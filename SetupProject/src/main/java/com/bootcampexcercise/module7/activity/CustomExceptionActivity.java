package com.bootcampexcercise.module7.activity;

/**
 *
 * This class defines a custom exception.
 * It is thrown when user is not valid.
 *
 */
public class CustomExceptionActivity extends Exception {

    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}