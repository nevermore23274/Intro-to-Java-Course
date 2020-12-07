/*
* Filename: DiscPost
* Programmer: Wilson, Tyler
* Date: 06DEC2020
*
* Requirements:
*    - Must use x and y as variables
*    - User must input both x and y
*    - Generate random numbers
*/
// Imports
import java.util.Scanner;
import java.util.Random;

public class DiscPost
{
	public static void main(String[] args) 
	{
		// Initialize variables and Scanner
        int x; // Number of values to randomize
        int y; // Maximum value of generated number
        Scanner uInput = new Scanner(System.in); // Take user input

        // Prompts for users
		System.out.println("\n\n**** Discussion Post Week 7 - Random Number Generator ****\n");
        System.out.print("Enter x value: ");
        x = uInput.nextInt();
        System.out.print("Enter y value: ");
        y = uInput.nextInt();
		
		// Print out users range in a statment
		System.out.println("\nYour number of elements is " + x + " with a maximum value of " + y + ".\n");

        // Number Generation block
        for(int i=1; i <= x; i++) 
		{ 
		    int genNumber = (int)(Math.random() * y); // Generate random number with respect to input of y value
            System.out.println("Index: " + i + " Random Number: " + genNumber); // Print the index along with the generated element
        }
    }
}
