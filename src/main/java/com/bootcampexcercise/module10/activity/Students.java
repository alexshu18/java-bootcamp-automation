package com.bootcampexcercise.module10.activity;

public class Students extends Person{
    private String schoolName;

    public Students(String name, int age) {
        super(name, age);
    }

    public Students(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String newSchoolName){
        this.schoolName = newSchoolName;
    }

    @Override
    void introduce() {
        System.out.println("I am study in " + getSchoolName());
    }
}
