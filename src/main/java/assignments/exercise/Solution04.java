package assignments.exercise;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */


/*
 * Print Statement asking for each fill in noun adj and so on
 * Set user inputs to strings
 * Print final output with the name of the User
 * print out final statement with user inputs
 */

import java.util.Scanner;
public class Solution04 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = userIn.nextLine();
        System.out.print("Enter a verb: ");
        String verb = userIn.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = userIn.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = userIn.nextLine();
        System.out.println("Do you "+verb +" your "+adjective +" " +noun +" " +adverb +"? That's hilarious!");
    }
}
