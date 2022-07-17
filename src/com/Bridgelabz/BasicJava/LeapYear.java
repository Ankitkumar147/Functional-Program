package com.Bridgelabz.BasicJava;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Year to check Leap Year :- ");
        int year = keyboard.nextInt();
        if ( year > 1000 && year < 9999 ) {
            System.out.println("You have entered the Year :- "+year);
            if ((year % 4 == 0) & (year % 100 !=0) || ( year % 400 == 0 )) {
                System.out.println("Entered Year " + year +" is a Leap Year");
            } else  {
                System.out.println( year + " This is not a Leap Year");
            }
        } else {
            System.out.println( "You have entered the Year :- " + year);
            System.out.println( "Enter Four digit year only b/w 1000 to 9999 !!!" );
        }
    }
}
