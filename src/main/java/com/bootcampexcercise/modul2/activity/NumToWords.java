package com.bootcampexcercise.modul2.activity;
//Oleksandr Shushyn
public class NumToWords {
    public static void main() {
        numToWordsSwitch(10);//calling true method
        numToWordsSwitch(11);//calling false method
        numToWordsSwitch(4);
        numToWordsSwitch(9);
    }

    public static void numToWordsSwitch(int i){
        switch(i) { //create the switch cases to transfer int to string
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("Not in range 1-10"); // default branch if the number is not in the range
        }
    }
}
