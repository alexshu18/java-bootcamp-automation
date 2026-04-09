package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushym
public class Calculator {
    static void main(String[] args) {
        System.out.println(Calculator.add(5,3));
        System.out.println(Calculator.subtract(10,7));
        System.out.println(Calculator.multiply(2,3));
        System.out.println(Calculator.modulo(5,2));
        System.out.println(Calculator.division(10,2));
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double modulo(double a, double b){
        return a % b;
    }
    public static int division(int a, int b){
        return a / b;
    }
}
