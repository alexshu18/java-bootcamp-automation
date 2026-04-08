package com.bootcampexcercise.module3.activity;
//Oleksandr Shushyn
public class Calculator {
    public static final String CALC_TYPE_BASIC = "basic";

    private String calculatorType;

    public Calculator(String calculatorType){
        this.calculatorType = calculatorType;
    }

    public String getCalculatorType(){
        return calculatorType;
    }

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public int multiply(int[] intValues){
        int result = 1;
        for (int i = 0; i < intValues.length; i++){
            result *= intValues[i];
        }
        return result;
    }
}
