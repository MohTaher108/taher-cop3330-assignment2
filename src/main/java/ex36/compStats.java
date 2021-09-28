/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex36;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class compStats
{
    // Function that reads values into an integer array list
    public static ArrayList<Integer> readValues() {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Declare an array list that will contain all the numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Allow the user to input a value
        System.out.print("Enter a number: ");
        String input = in.nextLine();

        // This while loop allows the program to stop reading input when "done" is inputted
        while(!input.equals("done")) {
            // This value will allow the entire loop to get ended if "done" is ever inputted in a while loop
            boolean check = true;
            // While loop that only allows valid inputs
            while (input.isEmpty() || !Character.isDigit(input.charAt(0))) {
                System.out.println("Input invalid.");
                System.out.print("Enter a number: ");
                input = in.nextLine();
                if (input.equals("done")) {
                    check = false;
                    break;
                }
            }
            // If "done" was inputted after a invalid input, then the function is ended here
            if(!check) break;

            // Take the integer in the string and put inside our integer array list
            numbers.add(Integer.parseInt(input));

            // Read next value and loop
            System.out.print("Enter a number: ");
            input = in.nextLine();
        }


            // Close the scanner
            in.close();

            // Return integer array list
            return numbers;
    }

    public static float average(ArrayList<Integer> numbers) {
        // total holds the sum of all numbers in the array list
        int total = 0;
        for(Integer nm : numbers) total = total + nm;

        // Return the mean of all numbers in the array list
        return (float) total / numbers.size();
    }

    public static int min(ArrayList<Integer> numbers) {
        // min will hold the smallest found value by looping through the array list
        int min = Integer.MAX_VALUE;
        for(Integer nm : numbers) if(min > nm) min = nm;
        // Return minimum number found
        return min;
    }

    public static int max(ArrayList<Integer> numbers) {
        // max will hold the largest found value by looping through the array list
        int max = 0;
        for(Integer nm : numbers) if(max < nm) max = nm;
        // Return maximum number found
        return max;
    }

    public static double std(ArrayList<Integer> numbers) {
        // Value will hold the sum of the squares of every number in the array list minus the mean
        double value = 0;
        for(int i = 0; i < numbers.size(); i++) {
            value = value + Math.pow(numbers.get(i) - average(numbers), 2);
        }
        // Return the standard deviation by square rooting value divided by the amount of numbers
        return Math.sqrt(value / numbers.size());
    }


    public static void main( String[] args )
    {
        // Input values
        ArrayList<Integer> numbers = readValues();

        // Print values
        System.out.print("Numbers: " + numbers.get(0));
        for(int i = 1; i < numbers.size(); i++) {
            System.out.print(", " + numbers.get(i));
        }

        // Decimal formatter for the standard deviation result format
        DecimalFormat df = new DecimalFormat("#.##");

        // Call all functions and print the values they return
        System.out.println("\nThe average is " + average(numbers));
        System.out.println("The minimum is " + min(numbers));
        System.out.println("The maximum is " + max(numbers));
        System.out.println("The standard deviation is " + df.format(std(numbers)));
    }
}
