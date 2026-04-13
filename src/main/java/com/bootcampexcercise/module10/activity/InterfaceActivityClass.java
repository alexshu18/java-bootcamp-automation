package com.bootcampexcercise.module10.activity;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
