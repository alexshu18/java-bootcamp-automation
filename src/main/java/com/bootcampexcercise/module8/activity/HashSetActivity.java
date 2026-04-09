package com.bootcampexcercise.module8.activity;

import java.util.HashSet;

public class HashSetActivity {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Alex");
        names.add("Gleb");
        names.add("Ilya");
        names.add("Vlad");
        names.add("Artem");
        names.add("Oleksandr");
        names.add("Maria");
        names.add("Svetlana");
        names.add("Disha");
        names.add("Vika");
        for (String s : names){
            System.out.println(s);
        }
        names.add("Alex");
        names.add("Vlad");
        System.out.println("---------");
        for (String s : names){
            System.out.println(s);
        }
        names.remove("Alex");
        names.remove("Vlad");
        System.out.println("---------");
        for (String s : names){
            System.out.println(s);
        }
        System.out.println("---------");
        System.out.println("HashSet contains Disha: " + names.contains("Disha"));
    }
}
