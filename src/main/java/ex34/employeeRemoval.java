/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex34;

import java.util.Scanner;

public class employeeRemoval
{
    // Create a function that will remove a specific employee name from a list of employees
    public static boolean removeEmployee(String[] listOfEmployees, String removedEmployee) {
        // Create a value that will keep track of which employee we're removing
        int employeeNumber = -1;

        // For loop that looks for the employee we're removing in the list of employees
        for(int i = 0; i < 5; i++) {
            if(removedEmployee.equals(listOfEmployees[i])) {
                employeeNumber = i;
                break;
            }
        }

        /* If employeeNumber never changed, the employee we want to remove isn't in the list
           Therefore an error message is printed, and the function is ended with a boolean value
           This boolean value will be used to tell main to end the program */
        if(employeeNumber == -1) {
            System.out.println("Error. Name does not exist in employee list.");
            return false;
        }

        // Rearrange the list of employees to remove the unneeded employee
        for(int j = 0; j < (4-employeeNumber); j++) {
            listOfEmployees[employeeNumber+j] = listOfEmployees[employeeNumber+j+1];
        }

        // Return true if the employee wanted to be removed was removed
        return true;
    }

    public static void main( String[] args )
    {
        // Open the scanner
        Scanner in = new Scanner(System.in);

        // Create a list of strings that contains all the employees' names
        String[] listOfEmployees = new String[5];
        listOfEmployees[0] = "John Smith";
        listOfEmployees[1] = "Jackie Jackson";
        listOfEmployees[2] = "Chris Jones";
        listOfEmployees[3] = "Amanda Cullen";
        listOfEmployees[4] = "Jeremy Goodwin";

        // Print the employee list
        System.out.println("There are 5 employees: ");
        for(int i = 0; i < 5; i++) {
            System.out.println(listOfEmployees[i]);
        }

        // Read in the employee that will be removed and call function that removes the chosen employee
        System.out.print("\nEnter an employee name to remove: ");
        String removedEmployee = in.nextLine();
        // If the employee name to remove doesn't exist in employee list, the program is ended
        if(!removeEmployee(listOfEmployees, removedEmployee)) return;

        // Print the new employee list
        System.out.println("\nThere are 4 employees: ");
        for(int i = 0; i < 4; i++) {
            System.out.println(listOfEmployees[i]);
        }

        // Close the scanner
        in.close();
    }
}
