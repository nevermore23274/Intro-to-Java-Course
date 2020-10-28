/*
Assignment: Week 3 Discussion Post
Programmer: Wilson, Tyler
Date: 20OCT2020
Description: Demonstrates the use of an if/else statement to act as a very basic "menu selection" screen. Uses a while statement to 'trap' the menu in a loop.
*/

// Import(s)
import java.util.Scanner;

public class wk3_disc_loops // Creates class, wk3_disc_loops
{
    public static void main(String[] args) // Creates main method.
    {
        Scanner input = new Scanner(System.in); // Sets the scanner as 'input'.

        while(true) // Creates infinite run loop.
        {
            System.out.print("Input '1' or '2' for output, 'q' for quit:  "); // Prints a request for specific input from user.
            String userInput = input.nextLine(); // Places the users input as userInput.

            if(userInput.equals("1")) // This if statment decides what is done if user inputs "1".
            {
                System.out.print("You've selected 1, coolio.\n"); // Print the statement, print a newline, then re-enter the while loop from the top.
            }

            else if (userInput.equals("2")) // Decides how to handle users input if it's "2".
            {
                System.out.print("You've selected 2, neat.\n"); // Print the statement, print a newline, then re-enter the while loop from the top.
            }

            else if (userInput.equals("q")) // Decides how to handle users input if it's "q".
            {
                System.out.println("Thank you for using my 'program', goodbye."); // Print the statement on a newline, then proceed to exit the program.
                input.close(); // Closes the scanner.
                break; // Exits the while loop.
            }

            else // This else statement functions to re-enter the loop due to faulty input that doesn't match any of the above conditions.
            {
                System.out.println("Error: Not a valid input.\n"); // Prints on a newline if users input doesn't match the 3 other checks, re-enters while loop.
            }
        }
    }
}