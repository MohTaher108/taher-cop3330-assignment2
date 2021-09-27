/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex39;

import java.util.ArrayList;
import java.util.HashMap;

public class sortRecords
{
    /* Function that creates an employee Hashmap, inputs all the employee's information into the Hashmap,
       then adds it to an array list for each employee, then returns the list of maps */
    public static ArrayList<HashMap<String, String>> listMapsInput() {
        // Array list of maps that contains all the employee information
        ArrayList<HashMap<String, String>> listMaps = new ArrayList<>();

        // Declare a hashmap that will contain all the employee's info
        HashMap<String, String> employee = new HashMap<>();
        employee.put("First Name", "John");
        employee.put("Last Name", "Johnson");
        employee.put("Position", "Manager");
        employee.put("SepDate", "2016-12-31");
        // Add the hashmap to the list
        listMaps.add(employee);
        // Repeat for every employee
        HashMap<String, String> employee2 = new HashMap<>();
        employee2.put("First Name", "Tou");
        employee2.put("Last Name", "Xiong");
        employee2.put("Position", "Software Engineer");
        employee2.put("SepDate", "2016-10-05");
        listMaps.add(employee2);

        HashMap<String, String> employee3 = new HashMap<>();
        employee3.put("First Name", "Michaela");
        employee3.put("Last Name", "Michaelson");
        employee3.put("Position", "District Manager");
        employee3.put("SepDate", "2015-12-19");
        listMaps.add(employee3);

        HashMap<String, String> employee4 = new HashMap<>();
        employee4.put("First Name", "Jake");
        employee4.put("Last Name", "Jacobson");
        employee4.put("Position", "Programmer");
        employee4.put("SepDate", "");
        listMaps.add(employee4);

        HashMap<String, String> employee5 = new HashMap<>();
        employee5.put("First Name", "Jacquelyn");
        employee5.put("Last Name", "Jackson");
        employee5.put("Position", "DBA");
        employee5.put("SepDate", "");
        listMaps.add(employee5);

        HashMap<String, String> employee6 = new HashMap<>();
        employee6.put("First Name", "Sally");
        employee6.put("Last Name", "Webber");
        employee6.put("Position", "Web Developer");
        employee6.put("SepDate", "2015-12-18");
        listMaps.add(employee6);

        return listMaps;
    }

    public static void main( String[] args )
    {
        // Create a list of maps that contains all employee info
        ArrayList<HashMap<String, String>> listMaps = listMapsInput();

        // Sort list by last names in alphabetical order
        for(int i = 0; i < 6; i++) {
            for(int j = i+1; j < 6; j++) {
                if(listMaps.get(i).get("Last Name").charAt(0) >= listMaps.get(j).get("Last Name").charAt(0)) {
                    HashMap<String, String> temp = listMaps.get(i);
                    listMaps.set(i, listMaps.get(j));
                    listMaps.set(j, temp);
                }
            }

        }

        // Format how the table looks
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        // Print the list
        for(int i = 0; i < 6; i++) {
            String fullName = listMaps.get(i).get("First Name") + " " + listMaps.get(i).get("Last Name");
            String s = String.format("%-19s | %-17s | %s", fullName, listMaps.get(i).get("Position"), listMaps.get(i).get("SepDate"));
            System.out.println(s);
        }
    }
}