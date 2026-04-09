package com.bootcampexcercise.module8.activity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * This class demonstrates how to use HashSet:
 * adding, removing, and iterating elements.
 *
 *output
 *
 *Original Set:
 * Alex
 * Eva
 * Mike
 * Tom
 * Lina
 * John
 * Disha
 * Mark
 * Sara
 * Anna
 *
 * After adding duplicates:
 * Alex
 * Eva
 * Mike
 * Tom
 * Lina
 * John
 * Disha
 * Mark
 * Sara
 * Anna
 *
 * After removing elements:
 * Alex
 * Eva
 * Lina
 * John
 * Disha
 * Mark
 * Sara
 * Anna
 *
 * Checking Disha:
 * Disha is present in the set
 *
 */
public class HashSetActivity {

    public static void main(String[] args) {

        // create HashSet
        Set<String> names = new HashSet<>();

        // add 10 names
        names.add("John");
        names.add("Mike");
        names.add("Anna");
        names.add("Sara");
        names.add("Disha");
        names.add("Alex");
        names.add("Tom");
        names.add("Eva");
        names.add("Lina");
        names.add("Mark");

        System.out.println("Original Set:");
        print(names);

        // add duplicates
        names.add("John");
        names.add("Disha");

        System.out.println("\nAfter adding duplicates:");
        print(names);

        // remove 2 values
        names.remove("Mike");
        names.remove("Tom");

        System.out.println("\nAfter removing elements:");
        print(names);

        // find "index" of Disha (HashSet has no index)
        System.out.println("\nChecking Disha:");
        if (names.contains("Disha")) {
            System.out.println("Disha is present in the set");
        } else {
            System.out.println("Disha is not in the set");
        }
    }

    // method to print set
    static void print(Set<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
    }
}