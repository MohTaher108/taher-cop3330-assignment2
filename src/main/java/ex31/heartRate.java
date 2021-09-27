/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex31;

import java.util.Scanner;

public class heartRate
{
    // Create a function that prints the entire table
    public static void targetRateTable(int pulse, int age) {
        // Print the table's format
        System.out.println("Intensity    | Rate   ");
        System.out.println("-------------|--------");

        // Declare percent and rate, which contain the intensity and target heart rate
        int percent = 50, rate;
        // For loop that loops through all 9 intensities
        for(int i = 0; i < 9; i++) {
            // Increment percent and change rate accordingly then print
            percent = percent + 5;
            rate = Math.round((((220 - age) - pulse) * ((float) percent/100)) + pulse);
            System.out.println(percent + "%          | " + rate + " bpm");
        }
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Declare 2 variables that will hold the resting rate and age,
        // and don't allow the user to input non-numeric values
        int pulse, age;

        System.out.print("Resting Pulse: ");
        while(!in.hasNextInt()) {
            System.out.println("Invalid input");
            System.out.print("Resting Pulse: ");
            in.next();
        }
        pulse = in.nextInt();

        System.out.print("Age: ");
        while(!in.hasNextInt()) {
            System.out.println("Invalid input");
            System.out.print("Age: ");
            in.next();
        }
        age = in.nextInt();

        // Call the function that prints the entire table
        targetRateTable(pulse, age);

        // Close scanner
        in.close();
    }
}
