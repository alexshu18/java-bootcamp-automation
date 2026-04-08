package com.bootcampexcercise.module3.activity;
//Oleksandr Shushyn
public class Car {
    private String brand;
    private String color;
    private int yearOfManufacture;

    public Car(String brand, String color, int yearOfManufacture){
        this.brand = brand;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public int getYearOfManufacture(){
        return yearOfManufacture;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setYearOfManufacture(int newYearOfManufacture){
        this.yearOfManufacture = newYearOfManufacture;
    }
}
