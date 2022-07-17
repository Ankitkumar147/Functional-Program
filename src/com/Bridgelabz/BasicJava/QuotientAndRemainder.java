package com.Bridgelabz.BasicJava;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter the Dividend :- ");
        Scanner keyboard = new Scanner(System.in);
        int dividend = keyboard.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = keyboard.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is :- "+quotient);
        System.out.println("Remainder is :- "+remainder);
    }
}
