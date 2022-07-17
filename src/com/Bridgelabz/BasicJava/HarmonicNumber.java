package com.Bridgelabz.BasicJava;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int harmonic = 0;
        System.out.println("Enter the number for harmonic number");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println("You Have Entered :- " + n);
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                harmonic = harmonic + (1/i);
            }
            System.out.println("Your harmonic no. is :- " + harmonic);
        }   else
            System.out.println("Enter the number greater than 0.");
    }
}

