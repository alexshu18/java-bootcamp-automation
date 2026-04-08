package com.bootcampexcercise.module5.activity;
//Oleksandr Shushyn
public class Person_I {
    private String name;
    private int age;

    public Person_I(){
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    @Override public String toString(){
        return this.name + " " + this.age;
    }

}
