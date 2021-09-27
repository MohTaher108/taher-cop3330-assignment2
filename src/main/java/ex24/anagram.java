/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex24;

import java.util.Scanner;

public class anagram
{
    // Anagram Checker
    public static boolean isAnagram(String s1, String s2) {
        // Declare a boolean value that will tell us whether we have an anagram or not
        boolean check = false;

        // Check that both words are equal length
        if(s1.length() != s2.length()) return false;

        /* Nested for loop that checks whether the letters in s1 exist in s2
           If exactly the same letters in s1 exist in s2, then check will remain true */
        for(int i = 0; i < s1.length(); i++) {
            // Reset check to false for every loop
            check = false;
            for(int j = 0; j < s2.length(); j++) {
                // If statement that checks whether the letters of both words are equal.
                if(s1.charAt(i) == s2.charAt(j)) {
                    // Set check = true to record that the letters are equal
                    check = true;
                    // Replaces the letter in the second string with 0 to not use it on another letter
                    s2 = s2.substring(0, j) + "0" + s2.substring(j+1);
                    // Break the loop so check isn't affected
                    break;
                }
            }
            // If check remained false throughout the whole loop, then s1's letter didn't exist in s2 therefore they aren't anagrams
            if(!check) return false;
        }
        return check;
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Read in the two strings
        String word1, word2;
        System.out.println("Enter two strings first and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        word1 = in.nextLine();
        System.out.print("Enter the second string: ");
        word2 = in.nextLine();

        // Return check from the anagram checker, and finally print the appropriate statement
        boolean check = anagram.isAnagram(word1, word2);
        if(check) System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        else System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");

        // Close scanner
        in.close();
    }
}
