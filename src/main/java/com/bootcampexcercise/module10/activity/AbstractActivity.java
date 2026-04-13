package com.bootcampexcercise.module10.activity;

public class AbstractActivity {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex", 25, "Developer", "Google", 5000);
        Students students = new Students("Dima", 22, "RTU");

        employee.introduce();
        students.introduce();
    }
}
