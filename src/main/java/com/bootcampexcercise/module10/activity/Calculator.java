package com.bootcampexcercise.module10.activity;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double divide(double a, double b){
        try {
            if (b == 0) throw new ArithmeticException("Division by zero");
            return a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Invalid division: " + ae.getMessage());
            return 0;
        }
    }

    public double multiply(double a, double b) throws CustomException{
        try{
        if (b == 0) throw new CustomException();
        return a * b;
        } catch (CustomException c){
            System.out.println("Invalid multiply: " + c.getMessage());
            return 0;
        }
    }
}
