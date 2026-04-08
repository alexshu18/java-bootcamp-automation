package com.bootcampexcercise.modul2.activity;
// Oleksandr Shushyn
public class PrintNumWithWhile {
    public static void main(){
        int i = 0; //declaring variable

        while (i < 100){
            if (i % 2 != 0){ // checking for odd number
                System.out.println("Odd number: " + i);//print all odd numbers
            }
            i++; //increase
        }
    }
}
