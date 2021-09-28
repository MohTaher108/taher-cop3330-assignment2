/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex37;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class passwordGenerator
{
    // Function that creates a character array list that contains all letters of the alphabet (lower and uppercase)
    public static ArrayList<Character> lettersList() {
        ArrayList<Character> letters = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            letters.add((char) (97+i));
        }
        for(int i = 0; i < 26; i++) {
            letters.add((char) (65+i));
        }

        return letters;
    }

    // Function that creates a character array list that contains all 10 numbers
    public static ArrayList<Character> numbersList() {
        ArrayList<Character> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) numbers.add((char) (48+i));

        return numbers;
    }

    // Function that creates a character array list that contains all possible special characters
    public static ArrayList<Character> specialCharList() {
        ArrayList<Character> specialChars = new ArrayList<>();
        for(int i = 0; i < 15; i++) specialChars.add((char) (33+i));
        for(int i = 0; i < 7; i++) specialChars.add((char) (58+i));
        for(int i = 0; i < 6; i++) specialChars.add((char) (91+i));
        for(int i = 0; i < 4; i++) specialChars.add((char) (123+i));
        return specialChars;
    }

    // Make password function that generates a random password
    public static ArrayList<Character> makePassword(int length, int numNumbers, int numSpecialChars) {
        // Create the 3 array lists that contain all letters, numbers, and specialChars
        ArrayList<Character> letters = lettersList();
        ArrayList<Character> numbers = numbersList();
        ArrayList<Character> specialChars = specialCharList();

        // Create a randomizer and a character array list for the password
        Random rand = new Random();
        ArrayList<Character> password = new ArrayList<>();

        /* Variables that will keep track of the numbers of letters, numbers, and special characters in the password
           This will be used to force a specific character in case there's too little of it */
        int numNumbersInPassword = 0, numSpecialCharsInPassword = 0, numLetters = 0;
        /* For loop that inputs characters into the password depending on a random value
           This loop keeps going for the inputted length up to +3 */
        for(int i = 0; i < length; i++) {
            // Generate a random number
            int randomNum = rand.nextInt(3);
            // If there are too little letters, force a random letter
            if(numLetters < (numNumbersInPassword + numSpecialCharsInPassword) + 1) randomNum = 0;
            // Else if there are too little numbers or special characters, then force them
            else if(numNumbersInPassword < numNumbers) randomNum = 1;
            else if(numSpecialCharsInPassword < numSpecialChars) randomNum = 2;
            // Depending on the randomized value, add a letter, number, or special character
            if(randomNum == 0) {
                password.add(letters.get(rand.nextInt(52)));
                numLetters++;
            }
            else if(randomNum == 1) {
                password.add(numbers.get(rand.nextInt(10)));
                numNumbersInPassword++;
            }
            else {
                password.add(specialChars.get(rand.nextInt(specialChars.size())));
                numSpecialCharsInPassword++;
            }
        }

        return password;
    }

    // Function that shuffles the password to make the order of character random
    public static ArrayList<Character> passwordShuffle(int length, ArrayList<Character> password) {
        // Make a randomizer
        Random rand = new Random();

        // For loop that goes through the password and shuffles every value
        for(int i = 0; i < length; i++) {
            // Save the value at index i to not lose it while shuffling
            char temp = password.get(i);
            // Get a random value
            int randValue = rand.nextInt(length);
            // Shuffle the values at index i and the randomized value
            password.set(i, password.get(randValue));
            password.set(randValue, temp);

        }
        return password;
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Read in min length, num of special characters, and num of numbers for the password
        int length, numSpecialChars, numNumbers;
        System.out.print("What's the minimum length? ");
        length = in.nextInt();
        System.out.print("How many special characters? ");
        numSpecialChars = in.nextInt();
        System.out.print("How many numbers? ");
        numNumbers = in.nextInt();

        // Generate random password
        ArrayList<Character> password = makePassword(length, numNumbers, numSpecialChars);
        // Shuffle password to make it even more random
        password = passwordShuffle(length, password);
        // Print password
        for(char c: password) System.out.print(c);

        // Close the scanner
        in.close();
    }
}
