package com.Bridgelabz.BasicJava;
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the exponential power of 2 between 0 & 31 :- ");
        int power = keyboard.nextInt();
        if ( 0 < power && power < 31 ) {
            int formula1 = (int) Math.pow(2, power);
            System.out.println("Power of 2^"+power+" is equal to "+formula1);
            System.out.println();
            System.out.println("Power of 2^"+power+ " till exponential "+power);
            System.out.println();
            for (int i = 1; i <= power; i++) {
                int Formula = (int)Math.pow(2,i);
                System.out.println ("Power of 2 ^" + i + " is equal to " +Formula);
            }
        } else
            System.out.println("Enter the number between 0 & 31. ");
    }
}
