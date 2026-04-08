package org;

import com.bootcampexcercise.modul2.activity.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        System.out.println(Calculator.add(5,3));
        System.out.println(Calculator.subtract(10,7));
        System.out.println(Calculator.multiply(2,3));
        System.out.println(Calculator.modulo(5,2));
        System.out.println(Calculator.division(10,2));
    }
}
