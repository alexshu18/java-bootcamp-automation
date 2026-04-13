package com.bootcampexcercise.module9.activity;
import com.bootcampexcercise.module8.activity.StudentArrayList;
import com.bootcampexcercise.module8.activity.Student;
import junit.framework.TestCase;

import java.util.ArrayList;
//Oleksandr Shushyn

public class StudentTest extends TestCase {
    private ArrayList<Student> student;

    @Override protected void setUp(){
        student = new ArrayList<Student>();
        student.add(new Student(1, "Alex", 4));
        student.add(new Student(2, "Dima", 3));
        student.add(new Student(3, "Vlad", 5));
    }

    @Override protected void tearDown(){
        student = null;
    }

    public void testAddStudent(){
        StudentArrayList.addStudent(student, new Student(4, "Ilya", 2));
        assertEquals(4, student.size());
    }

    public void testAddSameStudent(){
        StudentArrayList.addStudent(student, new Student(1, "Alex", 4));
        assertEquals(3, student.size());
    }

    public void testDeleteStudent(){
        StudentArrayList.deleteStudent(student, 1);
        assertEquals("Dima", student.getFirst().getName());
    }

    public void testTopStudent(){
        Student top = StudentArrayList.topStudent(student);
        assertEquals(5.0, top.getGrade());
    }

    public void testSetUp(){
        assertEquals(3, student.size());
    }
}
