/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex26;

import java.util.Scanner;

public class CreditCard
{
    // This method calculates months till you pay off a credit card balance by using the appropriate formula
    public static double calculateMonthsUntilPaidOff(double b, double p, double i) {
        return -((double) 1/30) * (Math.log10(1 + (b/p) * (1 - Math.pow(1+i, 30))) / Math.log10(1 + i));
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Variables: b contains the balance, p contains the monthly payment, i contains the daily rate (APR divided by 365)
        double b, p, i;

        // Read in all values
        System.out.print("What is your balance? ");
        b = Math.ceil(in.nextDouble());
        System.out.print("What is the APR on your card (as a percent)? ");
        i = in.nextDouble() / 36500;
        System.out.print("What is the monthly payment you can make? ");
        p = Math.ceil(in.nextDouble());

        // Return the number of months needed and print it
        int n = (int) Math.ceil(calculateMonthsUntilPaidOff(b, p, i));
        System.out.println("It will take you " + n + " months to pay off this card.");


        // Close scanner
        in.close();
    }
}
