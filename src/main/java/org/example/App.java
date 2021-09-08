/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote?\t");
        String quote = input.nextLine();
        String one = quote;

        Scanner answer = new Scanner(System.in);
        System.out.print("Who said it?\t");
        String author = answer.nextLine();
        String two = author;

        System.out.println(author + "\tsays" + "," + "\t\"" + (quote) + "\"");
    }

}
