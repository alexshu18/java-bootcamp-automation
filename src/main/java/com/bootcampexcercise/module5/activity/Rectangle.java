package com.bootcampexcercise.module5.activity;
//Oleksnadr Shushyn
public class Rectangle extends Shape{
    private int width;
    private int height;

    public void setWidth(int newWidth){
        this.width = newWidth;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    @Override
    double calculateArea(){
        return width * height;
    }
    @Override
    double calculatePerimeter(){
        return 2 * ( width + height);
    }
}
