package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * This class demonstrates how to use HashMap
 * to store key-value pairs and print them.
 *
 *
 * output
 *
 * ID: 1 Name: John
 * ID: 2 Name: Mike
 * ID: 3 Name: Anna
 * ID: 4 Name: Sara
 *
 */
public class MapActivity {

    public static void main(String[] args) {

        // create HashMap (id -> name)
        Map<String, String> map = new HashMap<>();

        map.put("1", "John");
        map.put("2", "Mike");
        map.put("3", "Anna");
        map.put("4", "Sara");

        // call print method
        new MapActivity().print(map);
    }

    void print(Map<String, String> map) {

        // iterate and print key-value pairs
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}