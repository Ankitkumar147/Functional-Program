package com.Bridgelabz.BasicJava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the Number :- ");
        Scanner keyboard = new Scanner(System.in);
        int userInput = keyboard.nextInt();
        if ( userInput % 2 == 0 )
        System.out.println("Given Number " + userInput + " is Even");
        else
        System.out.println("Given Number " + userInput + " is odd");
    }
}

