package com.bootcampexcercise.module10.activity;

import java.util.HashMap;

/**
 * Class: ElectronicItemDetails
 *
 * This class demonstrates the use of HashMap
 * to store item names and prices.
 *
 * output
 *
 * Price of TV is 500.0
 *
 */
public class ElectronicItemDetails {

    // method to return price of item
    public static double returnPriceOfItem(HashMap<String, Double> map, String name) {
        return map.get(name);
    }

    public static void main(String[] args) {

        // create HashMap of item name and price
        HashMap<String, Double> map = new HashMap<>();

        // add 4 electronic items
        map.put("TV", 500.0);
        map.put("Refrigerator", 800.0);
        map.put("Washing Machine", 600.0);
        map.put("Laptop", 1200.0);

        // print price of TV
        System.out.println("Price of TV is " + returnPriceOfItem(map, "TV"));
    }
}