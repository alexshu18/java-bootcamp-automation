package com.bootcampexcercise.module10.activity;


import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Alex", 20, "Back-end Developer", "Google",5000));
        empList.add(new Employee("Dima", 22, "Front-end Developer", "Amazon",4000));
        empList.add(new Employee("Vlad", 25, "DevOps", "Tesla",6000));
        empList.add(new Employee("Ilya", 26, "AI", "Microsoft",10000));
        empList.add(new Employee("Gleb", 27, "Cybersecurity", "Bosch",9000));

        Employee highest = Employee.getHighestPaidEmp(empList);
        System.out.println("The Employee whose salary is the highest is : " + highest.getName());
    }
}
