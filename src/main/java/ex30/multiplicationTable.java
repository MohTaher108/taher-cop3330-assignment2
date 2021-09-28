/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex30;

import java.util.Scanner;

public class multiplicationTable
{
    public static void printTable() {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Declare a string that will hold the entire table, and a temp string for inputting the values into the table
        String table = "", temp;
        // A nested for loop that will go through all 12 columns for all the 12 rows individually
        for(int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                // Copy the values into the temp string formatted properly, then add them into s
                temp = String.format("%3d  ", i*j);
                table = table + temp;
            }
            // Add a new line to the table since we finished a row
            temp = "\n";
            table = table + temp;
        }

        // Print the table
        System.out.print(table);

        // Close scanner
        in.close();
    }

    public static void main( String[] args )
    {
        // Print multiplication table
        printTable();
    }
}
