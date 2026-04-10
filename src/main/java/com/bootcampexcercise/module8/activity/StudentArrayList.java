package com.bootcampexcercise.module8.activity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alex", 5));
        students.add(new Student(2, "Vlad", 4));
        students.add(new Student(3, "Gleb", 3));
        students.add(new Student(4, "Ilya", 2));
        StudentArrayList.addStudent(students, new Student(2, "Dima", 4.5));


        StudentArrayList.printAllStudents(students);
        System.out.println("All students.");
        System.out.println("---------");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == 3) {
                students.remove(students.get(i));
                break;
            }
        }
        StudentArrayList.printAllStudents(students);
        System.out.println("---------");
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > topStudent.getGrade()) {
                topStudent = student;
            }
        }
        topStudent.printStudent();
        }
        public static void addStudent(ArrayList<Student> students, Student student){
            for (Student s : students) {
                if (s.getId() == student.getId()) {
                    System.out.println("Existing ID");
                    return;
                }
            }
            students.add(student);
        }
        public static void printAllStudents(ArrayList<Student> students){
            for (Student student : students) {
                student.printStudent();
            }
        }
    }

