package com.bootcampexcercise.module8.activity;

public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGrade(){
        return grade;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setGrade(double newGrade){
        this.grade = newGrade;
    }

    public void printStudent(){
        System.out.println("Student id: " + getId() + ", Student name: " + getName() + ", Student grade: " + getGrade());
    }
}
