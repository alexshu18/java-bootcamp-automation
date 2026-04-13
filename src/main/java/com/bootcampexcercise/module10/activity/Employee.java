package com.bootcampexcercise.module10.activity;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{
    private String jobTitle;
    private String company;
    private double salary;

    public Employee(String name, int age) {
        super(name, age);
    }
    public Employee(String name, int age, String jobTitle, String company, double salary){
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle(){
        return jobTitle;
    }
    public String getCompany(){
        return company;
    }
    public double getSalary(){
        return salary;
    }

    public void setJobTitle(String newJobTitle){
        this.jobTitle = newJobTitle;
    }

    public void setCompany(String newCompany){
        this.company = newCompany;
    }
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    @Override
    void introduce() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old.\nI am work as " + getJobTitle() + " in " + getCompany() + " and my salary is " + getSalary());

    }
    public static Employee getHighestPaidEmp(List<Employee> emp){
        Employee highest = emp.get(0);
        for (Employee e  :emp){
            if (e.getSalary() > highest.getSalary()){
                highest = e;
            }
        }
        return highest;
    }
}
