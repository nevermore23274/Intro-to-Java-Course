/*
* Filename(s): TestUSCrime.java, USCrime.java, USCrimeFile.java, USCrimeMethods.java
* Author: Wilson, Tyler
* Date: 13DEC2020
* Purpose: Read from Crime.csv and produce output based on user input
* Requirements:
*    + Use command line arguments (java TestUSCrime Crime.csv)
*    + Use multiple methods, at least two classes
*    + DO NOT MODIFY FILE (Crime.csv)
*    + Use arrays and classes to store data
*    + Create separate methods for each portion of functionality
*    + Make fancy menu
*        + Menu should be looped until Q is pressed
*    + Must keep track of time.
*        + Display local system time upon running
*        + Tell user how long they used program for upon exiting (and thank them for using app)
*/

// Imports
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class TestUSCrime 
{
    static Scanner input = new Scanner(System.in);
    static Scanner inputyear = new Scanner(System.in);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static DecimalFormat df3 = new DecimalFormat("###,###");
	
    public static void main(String[] args) 
	{
    
	    //Check for file argument
        if (args.length == 0)  
	    {
            System.out.println("\nError: Must have file name argument.");
		    System.exit(0);
	    }

        // Reference USCrimeFile
	    USCrime[] data = USCrimeFile.read(args[0]);

	    // Declare Variables
	    long startTime = System.currentTimeMillis();
	    long endTime;
	    String choice;
	    String userSelect;
	    int yearinput;

	    // Program Intro
        System.out.println("\n\n" + "********** Welcome to the US Crime Statistical Application **************************" + "\n\n");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Local Computer Date/Time: " + dtf.format(now));
	    System.out.println("\n" + "Enter the number of the question you want answered. Enter 'Q' to quit the program :");	

	    // While loop to get the USCrimeMenu Class
	    while (true)
		{
	        System.out.print(USCrimeMenu.getUSCrimeMenu());
            userSelect = input.nextLine();
	        System.out.println();
	        switch (userSelect)  
			{
		        case "1":
		            USCrimeMethods.disPopPct(data);
		            break;

		        case "2":
		            System.out.println("The highest Murder rate was " + USCrimeMethods.maxMurRte(data) + " per 100,000 inhabitants in the year " + USCrimeMethods.maxMurRteYr(data) + ".");
		            break;

                case "3":
                    System.out.println("The lowest Murder rate was " + USCrimeMethods.minMurRte(data) + " per 100,000 inhabitants in the year " + USCrimeMethods.minMurRteYr(data) + ".");
                    break;

                case "4":
                    System.out.println("The highest Robbery rate was " + USCrimeMethods.maxRobRte(data) + " per 100,000 inhabitants in the year " + USCrimeMethods.maxRobRteYr(data) + ".");
                    break;

                case "5":
                    System.out.println("The lowest Robbery rate was " + USCrimeMethods.minRobRte(data) + " per 100,000 inhabitants in the year " + USCrimeMethods.minRobRteYr(data) + ".");
				    break;

                case "Q" : case "q": // From StackOverflow, case statements don't accept expressions but accept values (thus why you'll get an error if you use ||)
				    endTime = System.currentTimeMillis();
				    System.out.println("\nThe elapsed time using this application was " + (endTime - startTime) / 1000 + " seconds.");
				    System.out.println("\nThank you for trying the US Crimes Statistics application.");
				    System.exit(0);

                default:
				    System.out.println("Error: Invalid selection! Please Try again.\n");
				    break;
			}
		}
	}
}