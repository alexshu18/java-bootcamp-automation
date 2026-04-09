package com.bootcampexcercise.module5.activity;

//Oleksandr Shushyn

public class AbstractActivity {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("blue");
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        System.out.println("Area of rectangle is: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle is: " + rectangle.calculatePerimeter());
        System.out.println("Color of rectangle is: " + rectangle.getColor());

        Circle circle = new Circle();
        circle.setColor("red");
        circle.setR(3);
        System.out.println("Area of circle is: " + circle.calculateArea());
        System.out.println("Perimeter of circle is: " + circle.calculatePerimeter());
        System.out.println("Color of circle is " + circle.getColor());


    }
}
