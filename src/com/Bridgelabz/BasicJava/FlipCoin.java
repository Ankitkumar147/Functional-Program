package com.Bridgelabz.BasicJava;
import java.util.Scanner;
public class FlipCoin {

    public static void main(String[] args) {

        int t = 0 , h = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin.");
        int flip = keyboard.nextInt();

        for (int i = 0; i < flip; i++) {
            double flipCoin = Math.floor(Math.random() % 10 * 2);

            if (flipCoin < 0.5) {
                System.out.println("You got Tails" );
                t++;
            } else {
                System.out.println("You Got Heads" );
                h++;}
        }
        System.out.println("Number of Times You Got Tails = " +t);
        System.out.println("Number of Times you Got Heads = "+ h);
        float tailPercent = (float) t/flip*100;
        float headPercent = (float) h/flip*100;
        System.out.println("Percentage of Tails = "+tailPercent +"%");
        System.out.println("Percentage of Heads = "+headPercent +"%");
    }
}