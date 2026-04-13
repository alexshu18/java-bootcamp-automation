package com.bootcampexcercise.module10.activity;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("The BIKE starts to drive");
    }

    @Override
    public void stop() {
        System.out.println("The BIKE stops driving");
    }
}
