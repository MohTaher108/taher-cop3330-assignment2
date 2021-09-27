/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex29;

import java.util.Scanner;

public class badInput
{
    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Declare a string that will hold the needed values
        String values;
        System.out.print("What is the rate of return? ");
        // Let user input value
        values = in.nextLine();
        // While loop to force user to enter a correct value
        while(values.length() != 1 || values.charAt(0) == '0' || !Character.isDigit(values.charAt(0))) {
            // If the user entered a non-numeric character, say so
            if(values.charAt(0) != '0') System.out.println("Sorry. That's not a valid input.");
            // If the user entered a 0, say so
            else System.out.println("Sorry. 0 isn't a valid input");
            System.out.print("What is the rate of return? ");
            // Set values = to the next value and loop
            values = in.nextLine();
        }
        // Extract the integer from values
        int r = Integer.parseInt(values);

        // Print calculation
        System.out.println("It will take " + (72 / r) + " years to double your initial investment.");

        // Close scanner
        in.close();
    }
}
