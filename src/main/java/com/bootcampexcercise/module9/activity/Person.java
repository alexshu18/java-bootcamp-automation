package com.bootcampexcercise.module9.activity;

public class Person {
    static void main(String[] args) {
        System.out.println(getBodyMassIndex(70, 1.75f));
    }
    private int weight;
    private float height;

    public int getWeight(){
       return weight;
    }

    public float getHeight(){
        return height;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }

    public void setHeight(float newHeight){
        this.height = newHeight;
    }

    public static String getBodyMassIndex(int weight, float height){
        if (weight < 0 || height < 0 || weight > 250 || height > 2.20f || weight == 0 || height == 0){
            return "Invalid parameters";
        }
        return Double.toString(weight / (height * height));
    }
}
