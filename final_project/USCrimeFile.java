// Imports
import java.util.Scanner;
import java.io.*;

public class USCrimeFile
{
	public static USCrime[] read(String filename)
	{
		// Array Declaration
		USCrime[] stats = new USCrime[20];
		
		// Variable Declaration
		int count = 0;
		String line;

		try
		{
			Scanner inputReader;
			inputReader = new Scanner(new File(filename));
			inputReader.nextLine();
			while (inputReader.hasNext())
			{
				line = inputReader.nextLine();
				String[] data = line.split(",");
				stats[count] = new USCrime(Integer.parseInt(data[0]));		//Crime Year
				stats[count].setPopulation(Integer.parseInt(data[1]));		//Population
				stats[count].setMurderRate(Float.parseFloat(data[5]));		//Murder Rate
				stats[count].setRobberyRate(Float.parseFloat(data[9]));		//Robbery Rate
				stats[count].setBurglaryRate(Float.parseFloat(data[15]));	//Burglary Rate
				stats[count].setRapeRate(Float.parseFloat(data[7]));		//Rape Rate
				count++;
			}
		
			inputReader.close();
		}
	
		//Error catcher
		catch (FileNotFoundException e)
		{
			System.out.println("\n" + e +"\n");
			System.out.println("Check filename, location, and re-reun program.");
			System.exit(0);
		}
	
		return stats;
	}
}