package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushyn
public class FindLargest {
    public static void main() {
        System.out.println("Max number is: " + findLargest(3,5,1));//calling method with parameters
    }

    public static int findLargest(int a, int b, int c) {//creating method with parameters for flexibility
        int max = a; //setting max value

        if (max < b){//checking if it is true
            max = b;
        }

        if (max < c){
            max = c;
        }

        return max;//returning the max value
    }

}
