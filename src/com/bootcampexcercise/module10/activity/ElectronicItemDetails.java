package com.bootcampexcercise.module10.activity;

import java.util.HashMap;

public class ElectronicItemDetails {
    public static void main(String[] args) {

        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();

        itemHashMap.put("TV", 999.0);
        itemHashMap.put("Refrigerator", 550.0);
        itemHashMap.put("Washing Machine", 750.0);
        itemHashMap.put("Laptop", 1050.0);

        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
        System.out.println("Price of Laptop is " + returnPriceOfItem(itemHashMap, "Laptop"));
    }

    public static double returnPriceOfItem(HashMap map, String name) {
        double value = (double) map.get(name);
        return value;
    }
}
