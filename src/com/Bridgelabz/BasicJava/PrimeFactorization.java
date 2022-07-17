package com.Bridgelabz.BasicJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Number for Prime Factorization N = ");
        int userInput = keyboard.nextInt();

        System.out.print("Prime Factors of "+userInput+" is : ");

        for (int i = 2; i < userInput; i++) {
            while (userInput%i == 0) {
                System.out.print(i+ ",");
                userInput = userInput/i;
            }
        }
        if (userInput > 2) {
            System.out.println(userInput);
        }
    }
}

