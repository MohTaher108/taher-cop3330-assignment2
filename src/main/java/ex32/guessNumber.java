/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex32;

import java.util.Scanner;
import java.util.Random;

public class guessNumber
{
    // Create a function that plays the guessing game
    public static void guessingGame() {
        // Open the scanner and create a randomizer
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Lets play Guess the Number!");

        // Create a value that will contain whether the user wants to play again
        char playAgain = 'y';
        // While loop that checks whether the user wants to play again
        while(playAgain == 'y' || playAgain == 'Y') {
            // Enter difficulty level, and don't allow non-numeric values
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            while(!in.hasNextInt()) {
                System.out.println("Error. Please enter a number");
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                in.next();
            }
            int difficulty = in.nextInt();

            // Create a variable that contains a random number depending on the difficulty level
            int guessMe = rand.nextInt((int) Math.pow(10, difficulty)) + 1;
            int numGuesses = 1;

            // Allow the user to input a guess, stop the user from inputting non-numeric values
            System.out.print("I have my number. What's your guess? ");
            while(!in.hasNextInt()) {
                System.out.print("Error. Guess again: ");
                numGuesses++;
                in.next();
            }
            int input = in.nextInt();

            // While loop to make the user keep trying different numbers
            while(input != guessMe) {
                numGuesses++;
                // If statements that checks whether the user's number is too low or too high
                if(input < guessMe) {
                    System.out.print("Too low. Guess again: ");
                    // Don't allow non-numeric values and increment number of guesses if input is non-numeric
                    while(!in.hasNextInt()) {
                        System.out.print("Error. Guess again: ");
                        in.next();
                        numGuesses++;
                    }
                    input = in.nextInt();
                }
                else if(input > guessMe) {
                    System.out.print("Too high. Guess again: ");
                    // Don't allow non-numeric values and increment number of guesses if input is non-numeric
                    while(!in.hasNextInt()) {
                        System.out.print("Error. Guess again: ");
                        in.next();
                        numGuesses++;
                    }
                    input = in.nextInt();
                }
            }

            // Print win message
            if(numGuesses == 1) System.out.println("You got it in one guess!");
            else System.out.println("You got it in " + numGuesses + " guesses!");

            // Ask the user if they want to play again (which loops the function)
            System.out.print("\nDo you wish to play again (Y/N)? ");
            playAgain = in.next().charAt(0);
        }

        // Close scanner
        in.close();
    }

    public static void main( String[] args )
    {
        // Call function that initiates the guessing game
        guessingGame();
    }
}
