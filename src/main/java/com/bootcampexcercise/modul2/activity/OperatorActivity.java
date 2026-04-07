package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushyn
public class OperatorActivity {
    public static void main() {
        int x = 10, y = 20, z = 30;
        int sum = x + y + z;
        int product = x * y * z;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        int a = z % y;
        System.out.println(a);
        int b = (x + y) * z;
        int c = x + y * z;
        System.out.println(b);
        System.out.println(c);
    }
}
