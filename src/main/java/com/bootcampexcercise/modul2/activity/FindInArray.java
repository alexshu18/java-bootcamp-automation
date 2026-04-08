package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushyn
public class FindInArray {
    public static void main() {
        int[] arrayOfInts = {2,5,12,14,67,13,105,89,72,64,14,10,48,36,51,28,19,71,82,99}; //creating array
        int result = arrayOfInts[0]; // set as a max value

        for (int i = 0; i < arrayOfInts.length; i++){ //for loop for the array
            if (arrayOfInts[i] > result){ //comparing with max value
                result = arrayOfInts[i];// if yes, reassigning the value
            }
        }
        System.out.println("The largest is: " + result);
    }
}
