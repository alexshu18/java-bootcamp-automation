package com.bootcampexcercise.module10.activity;

public class CustomException extends Exception {

    @Override public String getMessage(){
        return "Invalid input";
    }
}
