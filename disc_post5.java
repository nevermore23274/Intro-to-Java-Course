/*
* Requirements:
*    + Initialize array of primitive's
*    + Determine length of array
*    + Use length of array in some way
*/
// Import(s)
import java.util.Scanner;

public class disc_post5
{
	public static void main(String[] args)
	{
		// Set variables/scanner
		int numArray;
		int uiSum = 0;
		Scanner ui = new Scanner(System.in);
		
		System.out.print("\nEnter the number of elements you want to store: ");
		
		numArray = ui.nextInt(); // Reads users input for how many elements they'd like to use

		int[] array = new int[10]; // Gave array memory length of 10, gives a fancy error if you type in a number over 10
		System.out.println("\nYour Numbers: ");
		
		for(int i = 0; i < numArray; i++)
		{
			array[i]=ui.nextInt(); // Reading elements from user input
		}
		
		System.out.println("\nYour Input(s): ");
		
		for (int i = 0; i < numArray; i++) // Steps through array to print
		{
			System.out.println(array[i]);
		}
		
		for(int userDigit : array)
		{
			uiSum = uiSum + userDigit;
		}
		System.out.println("\nSum of Inputs: " + uiSum);
	}
}