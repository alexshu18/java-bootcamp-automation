package com.bootcampexcercise.module5.activity;
//Oleksandr Shushyn
public class Circle extends Shape{
    private int r;

    public void setR(int newR){
        this.r = newR;
    }

    @Override
    double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
