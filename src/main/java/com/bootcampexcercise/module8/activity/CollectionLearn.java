package com.bootcampexcercise.module8.activity;

import java.rmi.AlreadyBoundException;
import java.util.*;
//Oleksandr Shushyn
public class CollectionLearn {
    public static void main(String[] args) {
        names.add("Alex");
        names.add("Oleksandr");
        names.add("Gleb");
        names.add("Vlad");
        names.add("Ilya");
        names.add("Vadim");
        names.add("Artem");
        names.add("Sveta");
        names.add("Cristiano");
        names.add("Lionel");

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Hyundai");
        cars.add("Bugatti");
        cars.add("Porsche");
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Nissan");

        students.put(1, "Alex");
        students.put(2, "Oleksandr");
        students.put(3, "Gleb");
        students.put(4, "Vlad");
        students.put(5, "Ilya");
        students.put(6, "Vadim");
        students.put(7, "Artem");
        students.put(8, "Sveta");
        students.put(9, "Cristiano");
        students.put(10, "Lionel");

        System.out.println("Print list----------------");
        printList(names);
        System.out.println("Print set----------------");
        printSet();
        System.out.println("Print map----------------");
        printMap(students);
        System.out.println("Add list existing----------------");
        addToList(names, "Alex");
        System.out.println("Add list new----------------");
        addToList(names, "Vika");
        System.out.println("Add map existing----------------");
        addToMap(2, "Vika");
        System.out.println("Add map new----------------");
        addToMap(11, "Alisa");
        System.out.println("----------------");
        removeFromList(names, "Alex");
        System.out.println("----------------");
        removeFromSet(cars, "Mercedes");
        System.out.println("----------------");
        removeFromMap(3);
        System.out.println("----------------");
        replaceInList(names, "Gleb", "Vova");
        System.out.println("----------------");
        replaceInList(names, "Alex", "Lolly");
        System.out.println("----------------");
        replaceInSet(cars, "Toyota", "Kia");
        System.out.println("----------------");
        replaceInSet(cars, "Audi", "Tesla");
        System.out.println("----------------");
        replaceInMap(1,12, "Dima");
        System.out.println("----------------");
        replaceInMap(2,2,"Danya");
        System.out.println("----------------");
    }

    static ArrayList<String> names = new ArrayList<>();
    static HashSet<String> cars = new HashSet<>();
    static Map<Integer, String> students = new HashMap<>();

    public static void printList(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println("Names: " + list.get(i));
        }
    }

    public static void printSet(){
        for (String s : cars){
            System.out.println("Cars: " + s);
        }
    }

    public static void printMap(Map map){
        for (Object entry : map.entrySet()){
            System.out.println("Student: " + entry);
        }
    }

    public static void addToList(ArrayList<String> names, String newName){
        for (String s : names){
            if (s.equals(newName)){
                System.out.println("Existing name");
                return;
            }
        }
        names.add(newName);
        printList(names);
    }

    public static void addToMap(int id, String name){
            if (students.containsKey(id)){
                System.out.println("Existing ID");
                return;
            }
            students.put(id, name);
            printMap(students);
    }

    public static void removeFromList(ArrayList<String> names ,String removeName){
        names.removeIf(n -> (n.equals(removeName)));
        printList(names);
    }

    public static void removeFromSet(HashSet<String> cars, String removeCar){
        cars.removeIf(n -> (n.equals(removeCar)));
        printSet();
    }

    public static void removeFromMap(int id){
        if (students.containsKey(id)){
            students.remove(id);
        }
        printMap(students);
    }

    public static void replaceInList(ArrayList<String> names, String oldName, String newName){
        if (newName.equals(oldName)){
            System.out.println("Existing name");
            return;
        }
        int index = names.indexOf(oldName);
        if (index == -1) {
            System.out.println("Name is not found");
            return;
        }
        names.set(index, newName);
        printList(names);
        }

    public static void replaceInSet(HashSet<String> cars, String oldCar, String newCar){
        if (newCar.equals(oldCar)){
            System.out.println("Existing car");
            return;
        }
        if (!cars.contains(oldCar)) {
            System.out.println("Car not found");
            return;
        }
        cars.remove(oldCar);
        cars.add(newCar);
        printSet();
    }

    public static void replaceInMap(int oldId, int newId, String newName){
        if (oldId == newId){
            System.out.println("Existing ID");
            return;
        }
        students.remove(oldId);
        students.put(newId, newName);
        printMap(students);
    }
}
