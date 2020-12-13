/*
* Name: Wilson, Tyler
* Assignment: Week 8 Discussion Post
* Date: 12DEC2020
* Requirements:
*    + Create data file with int, double, or string values
*    + Echo files data
*    + State how many values were read in "*value* were read"
*/
// Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
{
	public static void main(String[] args) throws FileNotFoundException
	{	
	    File sLyrics = new File("TheMarinersSongLyrics.txt");
	    Scanner reader = new Scanner(sLyrics);
		String fContent = ""; // String to be read into
		int vCounter = 0; // Counter for vowels
		int cCounter = 0; // Counter for consanants
		int lCounter = 0; // Line counter
		int arrCharCount = 0; // Array character counter

		while(reader.hasNext())
		{
			fContent += reader.nextLine() + "\n"; // Step to lines and make new line for output
			lCounter++; // Line counter
		}
		
		reader.close(); // Close file reader
		
		char[] charArr = fContent.toCharArray(); // Create a character array to be written into

		for(char c : charArr)
		{
			if(Character.isLetter(c)) // Only acts on characters, not spaces or any special characters
			{
				arrCharCount++; // Incrememnt character counter
			}
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') // Vowel check
			{
			    vCounter++; // Increment vowel counter
			}
			
			// Y is "sometimes" a consanant, but I'm not dealing with that for a discussion post. So, it's only a vowel here [Consanant check]
			else if (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || 
			    c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' ||
                c == 't' || c == 'v' || c == 'w' || c == 'x' || c == 'z')
			{
			    cCounter++; // Increment consanant counter
			}
		}
		
		// Print statements
		System.out.println("\n\n" + "*** The Mariners Song - The Decemberists ***" + "\n\n" + fContent);
		System.out.println("Number of vowels: " + vCounter);
		System.out.println("Number of consanant: " + cCounter);
		System.out.println("Lines read: " + lCounter);
		System.out.println("Characters: " + arrCharCount);
	}
}