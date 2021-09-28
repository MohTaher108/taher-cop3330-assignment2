/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex27;

import java.util.Scanner;

public class validatingInputs
{
    // Check if the first name is empty by seeing if it has no characters in it
    public static boolean first_filled(String first) {
        if(first.equals("")) return false;
        else return true;
    }
    // Check if the first name is less than 2 characters long
    public static boolean first_2char(String first) {
        if(first.length() < 2) return false;
        else return true;
    }
    // Check if the last name is empty by seeing if it has no characters in it
    public static boolean last_filled(String last) {
        if(last.equals("")) return false;
        else return true;
    }
    // Check if the last name is less than 2 characters long
    public static boolean last_2char(String last) {
        if(last.length() < 2) return false;
        else return true;
    }
    // Check if the employee ID follows the format "AA-1234" by checking every index's value
    public static boolean employeeIDFormat(String employeeID) {
        // First check if the employee ID is the proper length so u don't go out of bounds
        if(employeeID.length() != 7) return false;
        for(int i = 0; i < 2; i++) if(!Character.isLetter(employeeID.charAt(i))) return false;
        if(employeeID.charAt(2) != '-') return false;
        for(int i = 3; i < 7; i++) if(!Character.isDigit(employeeID.charAt(i))) return false;
        return true;
    }
    // Check if the ZIP code contains 5 digits by looping through it
    public static boolean zipCheck(String ZIP) {
        // First check if the zipcode is the proper length so u don't go out of bounds
        if(ZIP.length() != 5) return false;
        for(int i = 0; i < 5; i++) {
            if(!Character.isDigit(ZIP.charAt(i))) return false;
        }
        return true;
    }
    // Call all the functions and save the text into one master string
    public static String validateInput(String first, String last, String employeeID, String ZIP) {
        // Declare all the needed strings and initialize s1-s6, so they're properly copied into s if they never change
        String s, s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "";
        if(!first_filled(first)) s1 = "The first name must be filled in.\n";
        if(!first_2char(first)) s2 = "The first name must be at least 2 characters long.\n";
        if(!last_filled(last)) s3 = "The last name must be filled in.\n";
        if(!last_2char(last)) s4 = "The last name must be at least 2 characters long.\n";
        if(!employeeIDFormat(employeeID)) s5 = "The employee ID must be in the format of AA-1234.\n";
        if(!zipCheck(ZIP)) s6 = "The zipcode must be a 5 digit number.\n";
        // If none of the strings were changed, no errors were found and that's copied into the master string
        if(s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("")) s = "There were no errors found.";
            // Otherwise, save all the text into the master string
        else s = s1+s2+s3+s4+s5+s6;
        // Return the master string to be printed
        return s;
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Store the first name, last name, employee ID, and ZIP into strings.
        String first, last, employeeID, ZIP;

        // Read in all values
        System.out.print("Enter the first name: ");
        first = in.nextLine();
        System.out.print("Enter the last name: ");
        last = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        ZIP = in.nextLine();
        System.out.print("Enter the employee ID: ");
        employeeID = in.nextLine();

        // Set string s equal to the master string created by this method and print it
        String s = validateInput(first, last, employeeID, ZIP);
        System.out.println(s);

        // Close scanner
        in.close();
    }
}
