/*
 * Filename: Discussion Post 4
 * Programmer: Wilson, Tyler
 * Date: 15NOV2020
 * 
 * Requirements:
 *     + One Constructor
 *     + Two methods
 *     + Two fields, both private
 */

// Imports(s)
import java.util.Scanner;

// Define class
public class disc_post
{
    private static void getX() // Define first method, private
    {
        Scanner getX = new Scanner(System.in); // Set X scanner
        System.out.print("Please input X: ");  // Request user input
        String X = getX.nextLine(); // Take user input
        System.out.print("X is: " + X + "\n"); // Print user input, and new line
    }

    private static void getY() // Define second method, private
    {
        Scanner getY = new Scanner(System.in); // Set Y scanner
        System.out.print("Please input Y: "); // Request user input
        String Y = getY.nextLine(); // Take user input
        System.out.print("Y is: " + Y); // Print user input
    }

    public static void main(String[] args) // Set main function, call both methods
    {
        getX(); // Call getX() method
        getY(); // Call getY() method
    }
}
