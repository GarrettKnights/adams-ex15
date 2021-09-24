/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise15;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

        //Declares variables we will be using
        String UserPass;

        //Initializes Scanner
        Scanner ScanWord = new Scanner(System.in);

        // Ask user to enter the password
        System.out.println("What is the password? ");
        UserPass = ScanWord.next();


        //If password is correct
        if (UserPass.equalsIgnoreCase("abc$123")) {

            System.out.println("Welcome!");
        }
        //If password is not correct
        else {
            System.out.println("I don't know you.");
        }
    }
}
