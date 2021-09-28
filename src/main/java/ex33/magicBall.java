/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex33;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class magicBall
{
    // Function that makes a list of all possible responses
    public static ArrayList<String> createAnswerList(){
        ArrayList<String> answerList = new ArrayList<>();
        answerList.add("Yes");
        answerList.add("No");
        answerList.add("Maybe");
        answerList.add("Ask again later.");

        return answerList;
    }

    // Make a function that creates a list of possible responses and prints a random one
    public static void magicBallResponse() {
        // Make a list of possible responses
        ArrayList<String> answerList = createAnswerList();

        // Make a randomizer
        Random rand = new Random();

        // Get a random number from 0 to 3 and print the corresponding response from the list
        System.out.print(answerList.get(rand.nextInt(4)));
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Read in the user's question
        System.out.print("What's your question?\n> ");
        in.nextLine();
        System.out.println();

        // Call function to give random response
        magicBallResponse();

        // Close the scanner
        in.close();
    }
}
