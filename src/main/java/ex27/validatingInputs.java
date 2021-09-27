/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex27;

import java.util.Scanner;

// Create a class that contains all the values and methods needed
class account {

    // Store the first name, last name, employee ID, and ZIP into strings.
    String first, last, employeeID, ZIP;

    // Check if the first name is empty by seeing if it has no characters in it
    public boolean first_filled() {
        if(this.first.equals("")) return false;
        else return true;
    }
    // Check if the first name is less than 2 characters long
    public boolean first_2char() {
        if(this.first.length() < 2) return false;
        else return true;
    }
    // Check if the last name is empty by seeing if it has no characters in it
    public boolean last_filled() {
        if(this.last.equals("")) return false;
        else return true;
    }
    // Check if the last name is less than 2 characters long
    public boolean last_2char() {
        if(this.last.length() < 2) return false;
        else return true;
    }
    // Check if the employee ID follows the format "AA-1234" by checking every index's value
    public boolean employeeIDFormat() {
        // First check if the employee ID is the proper length so u don't go out of bounds
        if(this.employeeID.length() != 7) return false;
        for(int i = 0; i < 2; i++) if(!Character.isLetter(this.employeeID.charAt(i))) return false;
        if(this.employeeID.charAt(2) != '-') return false;
        for(int i = 3; i < 7; i++) if(!Character.isDigit(this.employeeID.charAt(i))) return false;
        return true;
    }
    // Check if the ZIP code contains 5 digits by looping through it
    public boolean zipCheck() {
        // First check if the zipcode is the proper length so u don't go out of bounds
        if(this.ZIP.length() != 5) return false;
        for(int i = 0; i < 5; i++) {
            if(!Character.isDigit(this.ZIP.charAt(i))) return false;
        }
        return true;
    }
    // Call all the functions and save the text into one master string
    public String validateInput() {
        // Declare all the needed strings and initialize s1-s6, so they're properly copied into s if they never change
        String s, s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "";
        if(!first_filled()) s1 = "The first name must be filled in.\n";
        if(!first_2char()) s2 = "The first name must be at least 2 characters long.\n";
        if(!last_filled()) s3 = "The last name must be filled in.\n";
        if(!last_2char()) s4 = "The last name must be at least 2 characters long.\n";
        if(!employeeIDFormat()) s5 = "The employee ID must be in the format of AA-1234.\n";
        if(!zipCheck()) s6 = "The zipcode must be a 5 digit number.\n";
        // If none of the strings were changed, no errors were found and that's copied into the master string
        if(s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("")) s = "There were no errors found.";
        // Otherwise, save all the text into the master string
        else s = s1+s2+s3+s4+s5+s6;
        // Return the master string to be printed
        return s;
    }
}

public class validatingInputs
{
    public static void main( String[] args )
    {
        // Open the scanner and make a class that contains all needed values and methods
        Scanner in = new Scanner(System.in);
        account person = new account();

        // Read in all values
        System.out.print("Enter the first name: ");
        person.first = in.nextLine();
        System.out.print("Enter the last name: ");
        person.last = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        person.ZIP = in.nextLine();
        System.out.print("Enter the employee ID: ");
        person.employeeID = in.nextLine();

        // Set string s equal to the master string created by this method and print it
        String s = person.validateInput();
        System.out.println(s);

        // Close scanner
        in.close();
    }
}
