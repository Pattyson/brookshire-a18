/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution18 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        String choice;
        int C, F;

        System.out.println("Press C to convert from Fahrenheit to Celsisu.\r\nPress F to convert from Celsius to Fahrenheit.");
        choice = input.next();

        if(choice.equals("C") || choice.equals("c")) {
            System.out.println("Please enter temperature in Fahrenheit:");
            F = input.nextInt();
            C = (F - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + C);
        }
        if(choice.equals("F") || choice.equals("f")){
            System.out.println("Please enter temperature in Celsius:");
            C = input.nextInt();
            F = ((C * 9) / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + F);
        }
    }

}

