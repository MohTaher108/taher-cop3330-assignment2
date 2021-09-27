/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex25;

import java.util.ArrayList;
import java.util.Scanner;

public class passwordValidation
{
    // Password strength checker
    public static int passwordValidator(String s) {
        // Declare boolean values that will determine keep track of what's in the password
        boolean numCheck = false, letterCheck = false, specialCharCheck = false;

        // Loop through the whole password and check if it has numbers, letters, or special characters
        for(int i = 0; i < s.length(); i++) {
            // If the ASCII number of the character is one of the ASCII numbers for a digit, then numCheck = true
            if(Character.isDigit(s.charAt(i))) {
                numCheck = true;
                continue;
            }
            // If the ASCII number of the character is one of the ASCII numbers for a letter (lower or uppercase), then letterCheck = true
            if((Character.isLetter(s.charAt(i)))) {
                letterCheck = true;
                continue;
            }
            /* If the ASCII number of the character is one of the ASCII numbers for any special character, then specialCharCheck = true
               Also if the ASCII number of the character is a letter or digit, that's skipped because of the previous if statements */
            if(s.charAt(i) > 32 && s.charAt(i) < 127) {
                specialCharCheck = true;
            }
        }

        // Return a number that represents the strength of the password depending on the contents of the password
        if(numCheck && !letterCheck && !specialCharCheck && s.length() < 8) return 0;
        else if(letterCheck && !numCheck && !specialCharCheck && s.length() < 8) return 1;
        else if(numCheck && letterCheck && !specialCharCheck && s.length() >= 8) return 2;
        else if(numCheck && letterCheck && specialCharCheck && s.length() >= 8) return 3;
        else return 4;
    }

    public static void main( String[] args )
    {
        // Open the scanner and make a class to store the password and check its strength
        Scanner in = new Scanner(System.in);
        String password;

        // Read in the password
        System.out.print("Please enter a password: ");
        password = in.nextLine();

        // Return the strength of the password
        int strength = passwordValidator(password);

        // Create a string array list that will contain the password strength strings
        ArrayList<String> strengthString = new ArrayList<>();
        strengthString.add("very weak");
        strengthString.add("weak");
        strengthString.add("strong");
        strengthString.add("very strong");

        // Tell the user the strength of their password
        System.out.println("The password '" + password + "' is a " + strengthString.get(strength) + " password.");

        // Close scanner
        in.close();
    }
}
