package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushyn
public class FindLargest {
    public static void main() {
        System.out.println("Max number is: " + findLargest(3,5,1));
    }

    public static int findLargest(int a, int b, int c) {
        int max = a;

        if (max < b){
            max = b;
        }

        if (max < c){
            max = c;
        }

        return max;
    }

}
