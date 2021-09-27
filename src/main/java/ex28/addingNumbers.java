/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex28;

import java.util.Scanner;

// Make a class that will contain the sumNumbers method
class numbers {

    // Adds all the numbers together into one value and returns it
    public int sumNumbers(int n, int[] numberList) {
        int sum = 0;
        for(int i = 0; i < n; i++) sum = sum + numberList[i];
        return sum;
    }
}

public class addingNumbers
{
    public static void main( String[] args )
    {
        // Open the scanner and make a class that contains all the needed methods
        Scanner in = new Scanner(System.in);
        numbers numbersClass = new numbers();

        // Declare a variable n that will contain the amount of numbers that will be added together
        int n;
        // Read in n
        System.out.print("Enter the amount of numbers you would like to sum: ");
        n = in.nextInt();

        // Declare the number array size of n and read in all the input
        int[] numberList = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numberList[i] = in.nextInt();
        }

        // Call the function and set the sum of all numbers equal to the "sum" variable and print
        int sum = numbersClass.sumNumbers(n, numberList);
        System.out.println("The total is " + sum + ".");

        // Close scanner
        in.close();
    }
}
