package com.bootcampexcercise.module5.activity;
//Oleksandr Shushyn
public class Employee_I extends Person_I{
    private double salary;
    private String title;

    public double getSalary(){
        return salary;
    }
    public String getTitle(){
        return title;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    @Override public String toString(){
        return this.getName() + " " + this.getAge() + " " + this.title + " " + this.salary;
    }
}
