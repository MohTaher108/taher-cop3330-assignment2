/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex35;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class pickWinner
{
    // Function that reads in a bunch of names and stores them into a list and returns it
    public static ArrayList<String> inputNames() {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Create an arraylist called namesList that will contain all the names
        ArrayList<String> namesList = new ArrayList<>();

        // Allow the user to input a name
        System.out.print("Enter a name: ");
        String s = in.nextLine();
        /* If the entry was blank then this while loop won't save that entry.
           Otherwise, it saves the name into namesList.
           Then it allows the user to input another value and loops */
        while(!s.isEmpty()) {
            namesList.add(s);
            System.out.print("Enter a name: ");
            s = in.nextLine();
        }

        // Close the scanner
        in.close();

        return namesList;
    }

    public static void main( String[] args )
    {
        // Read in all names and stored into an arraylist
        ArrayList<String> namesList = inputNames();

        // Make a randomizer and print whoever was randomly chosen by the randomizer
        Random rand = new Random();
        System.out.println("The winner is... " + namesList.get(rand.nextInt(namesList.size())));
    }
}
