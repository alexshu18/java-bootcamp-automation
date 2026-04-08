package com.bootcampexcercise.modul2.activity;
// Oleksandr Shushyn
public class AddWholeNum {
    public static void main(){

        int result = 0; // declaring the variable

        for (int i = 50; i <= 100; i++) {//basic approach to have the result of sum of numbers from 50 to 100
            result += i;
        }
        System.out.println("Sum = " + result);//printing
        System.out.println("Sum: " + sumOfInt(50,100));//calling this method and printing


    }
    public static int sumOfInt(int a, int b) {//creating method with parameters for flexibility
        int sum = 0; //declaring sum
        for (int i = a; i <= b; i++){ //for loop for sum
            sum += i;
        }
        return sum;
    }
}
