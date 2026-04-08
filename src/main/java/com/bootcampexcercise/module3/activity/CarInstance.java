package com.bootcampexcercise.module3.activity;

public class CarInstance {


    public static void main(String[] args){
        Car car = new Car("BMW", "black", 2026);
        System.out.println(car.getBrand());
        System.out.println(car.getBrand() + " " + car.getColor() + " " + car.getYearOfManufacture());

    }
}
