package com.bootcampexcercise.module10.activity;

import java.util.HashMap;

public class ElectronicItemDetails {
    HashMap<String , Double> itemHashMap = new HashMap<>();
    public static void main(String[] args) {
        ElectronicItemDetails details = new ElectronicItemDetails();
        details.itemHashMap.put("TV", 1000.0d);
        details.itemHashMap.put("Refrigerator", 2000.0d);
        details.itemHashMap.put("Washing Machine", 500.0d);
        details.itemHashMap.put("Laptop", 1200.0d);

        System.out.println("Price of TV is " + details.returnPriceOfItem(details.itemHashMap, "TV"));
    }

    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name){
        return itemHashMap.get(name);
    }
}
