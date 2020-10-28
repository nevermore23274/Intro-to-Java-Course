/*
Assignment: Week 2 Discussion Post
Student: Wilson, Tyler
Date: 17OCT2020
Purpose: Demonstrate buggy code, as well as correct code
 */

public class buggy
{
	public static void main(String[] args)
	{
		// Begin if loop that starts at 0 and ends at 5
		for (int i=0; i<5; i++) // Replaced i-- with i++, removes infinite loop
		{
			System.out.println("i = "+i); // Placed missing +i, now you can at least see the values
		}
	}
}
