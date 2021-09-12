package org.example;
import java.util.Calendar;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age?");
        String age = input.nextLine(); //Input
        int ageNum = Integer.parseInt(age);//Turns String into Int
        System.out.println("At what age would you like to retire?");
        String retire = input.nextLine(); //Input
        int retireNum = Integer.parseInt(retire);//Turns String into Int
        int year = Calendar.getInstance().get(Calendar.YEAR);//Grabs current year
        System.out.println("You have " + (retireNum - ageNum) + " years left until you can retire.");//Output
        System.out.println("It's " + year + ", " + "so you can retire in " + (year + (retireNum-ageNum)) + " .");//Output



    }
}
