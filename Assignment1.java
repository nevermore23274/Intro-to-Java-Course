/*
 * Filename: Mainform
 * Programmer: Wilson, Tyler
 * Date: 27OCT2020
 * 
 * Requirements:
 *     + Request student employee number
 *     + Request 3 quiz scores (scale of 0-100)
 *     + Request age in months
 *     + Request temperature in Celsius
 *     + Display employee number, then the three quiz scores
 *     + Display average of three test scores, then display age in months
 *     + Display conversion of age in months to age in years
 *     + Display degrees in C, then convert to degrees in F
 *     + Ensure you use the actual degrees symbol ( U+2103 is for C, U+2109 is for F)
 */

// Package and imports
//package homework1.java;
import java.util.Scanner;

public class MainForm // Set MainForm class
{
	// Main Menu *Made for future use/programs extensibility*
	public static void main(String[] args)
	{	
		Scanner menuOption = new Scanner(System.in); // Create scanner object for users input in the menu
		
		// Main Menu statements
		System.out.println("**** Welcome to Tyler's Program ****");
		System.out.println("\n**** Please enter the module number you'd like to use ****\n");
		System.out.println("1.) Answering Nonsensical Questions");
		
		System.out.print("\nOption: ");
		int userInput = menuOption.nextInt(); // Take users input as an integer for the loop
        
        switch (userInput)
        {
            case 1: MyMethod();
                    menuOption.close();
                    break;

            default: System.err.println("Invalid Input");
                     //break;
        }
	}
	
	// Create method for using input '1'
	static void MyMethod()
	{
		Scanner uObj = new Scanner(System.in); // Set scanner for users input
		
		System.out.println("**** Welcome to the 'Answering Nonsensical Questions' Module ****");
		
		// Student ID number
		System.out.print("Please enter you Student Employee ID Number: ");
		int eID = uObj.nextInt();
		
		// Quiz score(s)
		System.out.print("Please enter your score on Quiz 1: ");
		float qScore1 = uObj.nextFloat();
        System.out.print("Please enter your score on Quiz 2: ");
        float qScore2 = uObj.nextFloat();
        System.out.print("Please enter your score on Quiz 3: ");
        float qScore3 = uObj.nextFloat();

        float averageScore = (qScore1 + qScore2 + qScore3) / 3;
		
		// Users age
		System.out.print("Please enter your age (in whole months): ");
		float yearAge = uObj.nextInt();
        float monthAge = yearAge / 12;
		
		// Temperature
		System.out.print("Please enter the temperature (in Celsius): ");
		float cTemp = uObj.nextFloat();
        float fTemp = cTemp + 2;

        System.out.println("The temperature is Cel is: " + cTemp);
        System.out.println("The total temperature in Far is: " + fTemp);
		
        // Display computations and parameters
		uObj.close(); // Closes scanner
        System.out.println("\n**** USER INFORMATION ****\n");
		System.out.println(eID);
		System.out.println(qScore1);
        System.out.println(qScore2);
        System.out.println(qScore3);
        System.out.println("avg: " + averageScore);
		System.out.println(monthAge);
		System.out.println("ftemp: " + fTemp);
	}
}
