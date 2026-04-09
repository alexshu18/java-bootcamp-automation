package com.bootcampexcercise.module8.activity;
//Oleksandr Shushyn
import java.util.ArrayList;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alex");
        names.add("Gleb");
        names.add("Ilya");

        print(names);
    }

    static void print(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println("Name: " + list.get(i));
        }
    }
}
