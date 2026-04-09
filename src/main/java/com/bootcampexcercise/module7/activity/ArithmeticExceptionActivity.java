package com.bootcampexcercise.module7.activity;
//Oleksandr Shushyn
public class ArithmeticExceptionActivity {
    public static void main(String[] args){
        ArithmeticExceptionActivity myException = new ArithmeticExceptionActivity();
        myException.catchMe(10,0);
    }

    void catchMe(int num1, int num2){
        try {
            System.out.println("result: " + (num1 / num2));
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException: " + a.getMessage());
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}
