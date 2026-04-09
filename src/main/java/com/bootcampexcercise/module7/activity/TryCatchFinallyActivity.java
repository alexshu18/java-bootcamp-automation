package com.bootcampexcercise.module7.activity;

public class TryCatchFinallyActivity {
    public static void main(String[] args){
        catchMeIfYouCan();
    }

    static void catchMeIfYouCan(){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++){
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException " + e.getMessage());
        } finally {
            System.out.println("Everything is fine!");
        }
    }
}
