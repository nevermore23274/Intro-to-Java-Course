// Imports
import java.util.Random;

public class guitarSim
{
	// Set default variables
	private int numStrings;
	private double guitarLength;
	private String guitarManufacturer;
	private String guitarColor;
	
	public guitarSim() // Create genGuitar, for guitar non argument constructor
	{
		numStrings = 6;
		guitarLength = 28.2;
		guitarManufacturer = "Gibson";
		guitarColor = "black";
	}
	
	public guitarSim(int numStrings, int guitarLength, String guitarManufacturer, String guitarColor) // Create constructor for specifics
	{
		this.numStrings = numStrings;
		this.guitarLength = guitarLength;
		this.guitarManufacturer = guitarManufacturer;
		this.guitarColor = guitarColor;
	}
	
	public int getNumStrings() // Getter for numStrings
	{
		return this.numStrings;
	}
	
	public double getGuitarLength() // Getter for guitarLength
	{
		return this.guitarLength;
	}
	
	public String getGuitarManufacturer() // Getter for guitarManufacturer
	{
		return this.guitarManufacturer;
	}
	
	public String getGuitarColor() // Getter for guitarColor
	{
		return this.guitarColor;
	}
	
	public String playGuitar()
	{
		String playDefault = "[";
		char[] playNotes = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		
		double[] noteDuration = {0.25, 0.5, 1, 2, 4};
		
		Random randomGen = new Random(); // Generate based on random playNotes and noteDuration values
	
		int notes, duration;

		String retValue = "" + playDefault;
		for (int i = 0; i < 16; i++)
		{
			notes = randomGen.nextInt(7);
			duration = randomGen.nextInt(5);
			retValue = retValue + playNotes[notes] + "(" + String.valueOf(noteDuration[duration]) + ")";
		
			if (i != 15) retValue = retValue + ",";
			{
				// For loop that basically just puts a comma between each "input"
			}
		}
		retValue =  retValue + ']'; // Adds bracket to the end of the string
		return retValue;
	}
	
	// Display variables in string format
	public String toString()
	{
		return "numStrings= " + this.numStrings + ",guitarLength= " + this.guitarLength + ", guitarManufacturer= " + this.guitarManufacturer + ", guitarColor= " + this.guitarColor;
	}
}