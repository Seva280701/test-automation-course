package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * This class demonstrates how to use ArrayList
 * and print elements from a list.
 *
 * output
 *
 * John
 * Mike
 * Anna
 * Sara
 *
 */
public class ListActivity {

    public static void main(String[] args) {

        // create list of names
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mike");
        names.add("Anna");
        names.add("Sara");

        // call print method
        print(names);
    }

    static void print(List<String> list) {

        // print elements using loop
        for (String name : list) {
            System.out.println(name);
        }
    }
}