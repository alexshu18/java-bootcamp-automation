package com.bootcampexcercise.modul2.activity;

public class MultiplicationTable {
    public static void main() {
        for (int i = 11; i <= 20; i++){ //for loop for numbers to multiply
            for (int j = 1; j <= 10; j++) { // second loop to have 1 - 10 multipliers
                System.out.println(i + " * " + j + " = " + i * j);//printing the result in normal view
            }

        }
    }
}
