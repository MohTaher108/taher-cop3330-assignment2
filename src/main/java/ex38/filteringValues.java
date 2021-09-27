/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex38;

import java.util.Scanner;

public class filteringValues
{
    // Function that filters out all even numbers in the old array and saves them into a new array that it returns.
    public static int[] filterEvenNumbers(int[] numberArray) {
        // Declare the integer array that will hold all even numbers
        int[] evenNumberArray = new int[numberArray.length];
        // Initialize all values to 1, so they're not accidentally printed later
        for(int i = 0; i < numberArray.length; i++) evenNumberArray[i] = 1;
        // Value that will keep track of where to input numbers in the evenNumberArray
        int j = 0;

        // For loop that goes through all values we have and picks out the even numbers and saves them in the new array
        for(int num: numberArray) {
            if(num % 2 == 0) {
                evenNumberArray[j] = num;
                j++;
            }
        }

        return evenNumberArray;
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Input string of numbers
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbersString = in.nextLine();

        // Filter out numbers in string into the num array
        String[] numbersStringFixed = numbersString.split(" ");
        int[] numberArray = new int[numbersStringFixed.length];
        for(int i = 0; i < numbersStringFixed.length; i++) numberArray[i] = Integer.parseInt(numbersStringFixed[i]);

        // Get the new array that contains only the even numbers and print it
        int[] evenNumberArray = filterEvenNumbers(numberArray);
        System.out.print("The even numbers are");
        for(int num: evenNumberArray) if(num != 1) System.out.print(" " + num);
        System.out.println(".");

        // Close the scanner
        in.close();
    }
}
