package com.bootcampexcercise.module8.activity;

import java.util.*;

/**
 *
 *
 * This class demonstrates usage of ArrayList, HashSet and HashMap.
 * It supports adding, removing, replacing and printing values.
 *
 * output
 *
 * === Initial Data ===
 * ArrayList:
 * Name1
 * Name2
 * Name3
 * Name4
 * Name5
 * Name6
 * Name7
 * Name8
 * Name9
 * Name10
 *
 * HashSet:
 * Name3
 * Name4
 * Name5
 * Name6
 * Name7
 * Name8
 * Name9
 * Name10
 * Name1
 * Name2
 *
 * HashMap:
 * 1 -> Name1
 * 2 -> Name2
 * 3 -> Name3
 * 4 -> Name4
 * 5 -> Name5
 * 6 -> Name6
 * 7 -> Name7
 * 8 -> Name8
 * 9 -> Name9
 * 10 -> Name10
 * Duplicate in list: Name1
 * Duplicate in set: Name1
 * Duplicate in map: Name1
 *
 * === After Replace ===
 * ArrayList:
 * Name1
 * Name2
 * Name3
 * Name4
 * NewName5
 * Name6
 * Name7
 * Name8
 * Name9
 * Name10
 *
 * HashSet:
 * Name3
 * NewName5
 * Name4
 * Name6
 * Name7
 * Name8
 * Name9
 * Name10
 * Name1
 * Name2
 *
 * HashMap:
 * 1 -> Name1
 * 2 -> Name2
 * 3 -> Name3
 * 4 -> Name4
 * 5 -> NewName5
 * 6 -> Name6
 * 7 -> Name7
 * 8 -> Name8
 * 9 -> Name9
 * 10 -> Name10
 *
 * === After Remove ===
 * ArrayList:
 * Name1
 * Name3
 * Name4
 * NewName5
 * Name6
 * Name7
 * Name8
 * Name9
 * Name10
 *
 * HashSet:
 * Name3
 * NewName5
 * Name4
 * Name6
 * Name7
 * Name8
 * Name9
 * Name10
 * Name1
 *
 * HashMap:
 * 1 -> Name1
 * 3 -> Name3
 * 4 -> Name4
 * 5 -> NewName5
 * 6 -> Name6
 * 7 -> Name7
 * 8 -> Name8
 * 9 -> Name9
 * 10 -> Name10
 *
 */
public class CollectionLearn {

    // collections
    static List<String> list = new ArrayList<>();
    static Set<String> set = new HashSet<>();
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {

        // add initial values
        for (int i = 1; i <= 10; i++) {
            addValue("Name" + i, i);
        }

        System.out.println("=== Initial Data ===");
        printAll();

        // try duplicate
        addValue("Name1", 1);

        // replace values
        replaceValue("Name5", "NewName5", 5, "NewName5");

        System.out.println("\n=== After Replace ===");
        printAll();

        // remove values
        removeValue("Name2", 2);

        System.out.println("\n=== After Remove ===");
        printAll();
    }

    // add values (no duplicates)
    public static void addValue(String name, int key) {

        // list (check duplicate)
        if (!list.contains(name)) {
            list.add(name);
        } else {
            System.out.println("Duplicate in list: " + name);
        }

        // set (auto prevents duplicates)
        if (!set.add(name)) {
            System.out.println("Duplicate in set: " + name);
        }

        // map (check duplicate value)
        if (!map.containsValue(name)) {
            map.put(key, name);
        } else {
            System.out.println("Duplicate in map: " + name);
        }
    }

    // remove values
    public static void removeValue(String name, int key) {
        list.remove(name);
        set.remove(name);
        map.remove(key);
    }

    // replace values (no duplicates)
    public static void replaceValue(String oldName, String newName, int key, String newMapValue) {

        // list
        if (!list.contains(newName)) {
            int index = list.indexOf(oldName);
            if (index != -1) {
                list.set(index, newName);
            }
        }

        // set
        if (!set.contains(newName)) {
            set.remove(oldName);
            set.add(newName);
        }

        // map
        if (!map.containsValue(newMapValue)) {
            map.put(key, newMapValue);
        }
    }

    // print all collections
    public static void printAll() {

        System.out.println("ArrayList:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nHashSet:");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}