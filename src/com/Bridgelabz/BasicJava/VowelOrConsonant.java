package com.Bridgelabz.BasicJava;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet :- ");
        Scanner keyboard = new Scanner(System.in);
        char userInput = keyboard.next().charAt(0);
        switch (userInput) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Entered Alphabet " + userInput + " is a Vowel.");
                break;
            default:
                System.out.println("Entered Alphabet " + userInput + " is a Consonant.");
        }
    }
}
