package com.bootcampexcercise.module10.activity;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("The CAR starts to drive");
    }

    @Override
    public void stop() {
        System.out.println("The CAR stops driving. Wroom Wroom");
    }
}
