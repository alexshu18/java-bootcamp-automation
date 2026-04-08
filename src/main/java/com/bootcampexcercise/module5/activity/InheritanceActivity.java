package com.bootcampexcercise.module5.activity;
//Oleksandr Shushyn
public class InheritanceActivity {
    public static void main(String[] args){
        Person_I myPerson = new Person_I();
        Employee_I myEmployee = new Employee_I();

        myPerson.setName("Sarah Johnson");
        myPerson.setAge(21);

        myEmployee.setName("Shawn Cun");
        myEmployee.setSalary(70000.00);
        myEmployee.setTitle("Developer");
        myEmployee.setAge(32);

        System.out.println(myPerson.getName() + " " + myPerson.getAge());
        System.out.println(myEmployee.getName() + " " + myEmployee.getAge() + " " + myEmployee.getTitle() + " " + myEmployee.getSalary());
        System.out.println("-----------------");
        System.out.println(myPerson);
        System.out.println(myEmployee);
    }

}
