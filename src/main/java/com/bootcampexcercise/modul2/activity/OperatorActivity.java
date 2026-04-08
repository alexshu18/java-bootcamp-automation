package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushyn
public class OperatorActivity {
    public static void main() {
        int x = 10, y = 20, z = 30; // declaring variable
        int sum = x + y + z;//testing sum
        int product = x * y * z;//testing product

        System.out.println("Sum: " + sum);//printing sum
        System.out.println("Product: " + product);//printing product

        int a = z % y;//test other operator
        System.out.println(a);
        int b = (x + y) * z;//adding brackets
        int c = x + y * z;
        System.out.println(b);
        System.out.println(c);
    }
}
