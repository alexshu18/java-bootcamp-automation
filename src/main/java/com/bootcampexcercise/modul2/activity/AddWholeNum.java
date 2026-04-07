package com.bootcampexcercise.modul2.activity;
// Oleksandr Shushyn
public class AddWholeNum {
    public static void main(){

        int result = 0;

        for (int i = 50; i <= 100; i++) {
            result += i;
        }
        System.out.println("Sum = " + result);
        System.out.println("Sum: " + sumOfInt(50,100));


    }
    public static int sumOfInt(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}
