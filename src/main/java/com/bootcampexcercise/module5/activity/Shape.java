package com.bootcampexcercise.module5.activity;
//Oleksandr Shushyn
public abstract class Shape {
    public String color;
    public Shape(){
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }


}
