package com.Bridgelabz.BasicJava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the three Numbers:- ");
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println(+number1 + " is greater in " + number1 + "," + number2 + "," + number3 + ".");
        } else if (number1 > number2 && number3 > number1) {
            System.out.println(+number3 + " is greater in " + number1 + "," + number2 + "," + number3 + ".");
        } else if (number2 > number3){
            System.out.println(+number2 + " is greater in " + number1 + "," + number2 + "," + number3 + ".");
        } else
            System.out.println(+number3 + " is greater in " + number1 + "," + number2 + "," + number3 + ".");
    }
}