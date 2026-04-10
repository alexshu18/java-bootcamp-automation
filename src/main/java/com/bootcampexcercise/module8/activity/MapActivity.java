package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<>();
        m.put("id1", "Alex");
        m.put("id2", "Vlad");
        print(m);

    }
    static void print(Map map){
        for (Object entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
