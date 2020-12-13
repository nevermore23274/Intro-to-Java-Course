/*
 * Filename: MainAssignment
 * Programmer: Wilson, Tyler
 */

// Imports
import java.util.Scanner;

public class MainAssignment // Set mainAssignment class for the main menu
{
	// Main Menu *Made for future use/programs extensibility*
	public static void main(String[] args)
	{	
		Scanner menuOption = new Scanner(System.in); // Create scanner object for users input in the menu
		boolean j = true; // Boolean set for menu loop

		// Main Menu statements
		System.out.println("**** Welcome to Tyler's Program ****");
		System.out.println("\n**** Please enter the module number you'd like to use ****\n");
		System.out.println("1.) Answering Nonsensical Questions");
		System.out.println("2.) Guitar Simulator");
		System.out.println("3.) Headphone Simulator");
		System.out.println("4.) State Information");
		
        	while(j=true) // Traps user in loop until an option is selected
        	{
		    System.out.print("\nOption: ");
		    int userInput = menuOption.nextInt(); // Take users input as an integer for the loop
       
            		switch (userInput)
            		{
        	        	case 1: randoQuestions(); // Steps into Assignment 1's method
	                        	break; // Breaks out of switch
								
						case 2: mainGuitar(); // Steps into Assignment 2's method
								break; // Breaks out of switch
						
						case 3: mainHeadphone(); // Steps into Assignment 3's method
								break; // Breaks out of switch
								
						case 4: StateInfo();
								break;

	 	               default: System.err.println("Invalid Input"); // Loops back into switch upon invalid input
        	    	}
        	}
	}
	
	// Create method for using input '1' for assignment 1
	static void randoQuestions()
	{
		Scanner uObj = new Scanner(System.in); // Set scanner for users input
		
		System.out.println("**** Welcome to the 'Answering Nonsensical Questions' Module ****");
		
		// Student ID number
		System.out.print("Please enter you Student Employee ID Number: ");
		String eID = uObj.nextLine();
		
		// Quiz score(s)
		System.out.print("Please enter your score on Quiz 1: ");
		double qScore1 = uObj.nextFloat();
        System.out.print("Please enter your score on Quiz 2: ");
        double qScore2 = uObj.nextFloat();
        System.out.print("Please enter your score on Quiz 3: ");
        double qScore3 = uObj.nextFloat();

        double averageScore = (qScore1 + qScore2 + qScore3) / 3;
		
		// Users age
		System.out.print("Please enter your age (in whole months): ");
		float monthAge = uObj.nextInt();
        float yearAge = monthAge / 12;
		
		// Temperature
		System.out.print("Please enter the temperature (in Celsius): ");
		double cTemp = uObj.nextDouble();
        double fTemp = Math.round(cTemp * 1.8 + 32); // Rounds off fTemp after computation
		
        // Display computations and parameters
		uObj.close(); // Closes scanner
        System.out.println("\n**** USER INFORMATION ****\n");
		System.out.println("EMPLID: "+ eID);
		System.out.printf("Quiz 1 Score: %.2f %n", qScore1);
        System.out.printf("Quiz 2 Score: %.2f %n", qScore2);
        System.out.printf("Quiz 3 Score: %.2f %n", qScore3);
        System.out.printf("Average Quiz Score: %.2f %n", averageScore);
        System.out.println("Age in Months: " + monthAge);
		System.out.println("Age in Years: " + yearAge);
		System.out.println("Temperature in Celsius: " + cTemp + "\u00B0" + "C");
        System.out.println("Temperature in Fahrenheit: " + fTemp + "\u00B0" + "F");
        System.out.println("\n");
        System.exit(0); // Hard program exit
	}
	
	// Create method for using input '2' for assignment 2
	static void mainGuitar()
	{
		// Display information from guitarSim class
		System.out.println("\n**** Welcome to the 'Guitar Simulator' Module ****\n");
		guitarSim g1 = new guitarSim();
		System.out.println("toString(): " + g1.toString());
		System.out.println("getNumStrings(): " + g1.getNumStrings());
		System.out.println("getGuitarLength(): " + g1.getGuitarLength());
		System.out.println("getGuitarManufacturer(): " + g1.getGuitarManufacturer());
		System.out.println("getGuitarColor(): " + g1.getGuitarColor());
		System.out.println("playGuitar(): " + g1.playGuitar());
		System.exit(0); // Hard program exit
	}
	
	// Create method using input '3' for assignment 3
	static void mainHeadphone()
	{
		// Since we need 3 test cases, decided to just create all 3 in one go so my System.exit(0) means I'm done with test cases for assignment
        headphoneSim headphone1 = new headphoneSim();
        headphoneSim headphone2 = new headphoneSim(3, true, "Sony", "Dark Blue");
        headphoneSim headphone3 = new headphoneSim(1, true, "Sennheiser", "Black");
		
		// Display information from headphoneSim class
		System.out.println("\n**** Welcome to the 'Headphone Simulator' Module ****\n");
		System.out.println("First set of Headphones Attributes:");
        System.out.println(headphone1.toString());
		System.out.println("Second set of Headphones Attributes:");
		System.out.println(headphone2.toString());
		System.out.println("Third set of Headphones Attributes:");
		System.out.println(headphone3.toString());
		System.exit(0); // Hard program exit
	}
	
	static void StateInfo()
	{
		// Array in [0] State, [1] Bird, [2] Flower format
		String arr[][] = new String[50][3];
		arr[0][0] = "Alabama";
		arr[0][1] = "Yellowhammer";
		arr[0][2] = "Camellia";
		arr[1][0] = "Alaska";
		arr[1][1] = "Willow Ptarmigan";
		arr[1][2] = "Forget Me Not";
		arr[2][0] = "Arizona";
		arr[2][1] = "Cactus Wren";
		arr[2][2] = "Saguaro Cactus Flower";
		arr[3][0] = "Arkansas";
		arr[3][1] = "Northern Mockingbird";
		arr[3][2] = "Apple Blossom";
		arr[4][0] = "California";
		arr[4][1] = "California Quail";
		arr[4][2] = "Golden Poppy";
		arr[5][0] = "Colorado";
		arr[5][1] = "Lark Bunting";
		arr[5][2] = "Rocky Mountain Columbine";
		arr[6][0] = "Connecticut";
		arr[6][1] = "American Robin";
		arr[6][2] = "Mountain Laurel";
		arr[7][0] = "Delaware";
		arr[7][1] = "Blue Hen";
		arr[7][2] = "Peach Blossom";
		arr[8][0] = "Florida";
		arr[8][1] = "Northern Mockingbird";
		arr[8][2] = "Orange Blossom";
		arr[9][0] = "Georgia";
		arr[9][1] = "Cherokee Rose";
		arr[9][2] = "Brown Thrasher";
		arr[10][0] = "Hawaii";
		arr[10][1] = "Nene Goose";
		arr[10][2] = "Yellow Hibiscus";
		arr[11][0] = "Idaho";
		arr[11][1] = "Mountain Bluebird";
		arr[11][2] = "Syringa";
		arr[12][0] = "Illinois";
		arr[12][1] = "Cardinal";
		arr[12][2] = "Native Violet";
		arr[13][0] = "Indiana";
		arr[13][1] = "Cardinal";
		arr[13][2] = "Peony Paonia";
		arr[14][0] = "Iowa";
		arr[14][1] = "American Goldfinch";
		arr[14][2] = "Wild Rose";
		arr[15][0] = "Kansas";
		arr[15][1] = "Western Meadowlark";
		arr[15][2] = "Wild Native Sunflower";
		arr[16][0] = "Kentucky";
		arr[16][1] = "Cardinal";
		arr[16][2] = "Goldenrod";
		arr[17][0] = "Louisiana";
		arr[17][1] = "Eastern Brown Pelican";
		arr[17][2] = "White Blossom";
		arr[18][0] = "Maine";
		arr[18][1] = "Chickadee";
		arr[18][2] = "White Pine Cone and Tassel";
		arr[19][0] = "Maryland";
		arr[19][1] = "Baltimore Oriole";
		arr[19][2] = "Black-Eyed Susan";
		arr[20][0] = "Massachusetts";
		arr[20][1] = "Chickadee";
		arr[20][2] = "Mayflower";
		arr[21][0] = "Michigan";
		arr[21][1] = "American Robin";
		arr[21][2] = "Apple Blossom";
		arr[22][0] = "Minnesota";
		arr[22][1] = "Loon";
		arr[22][2] = "The Lady's Slipper";
		arr[23][0] = "Mississippi";
		arr[23][1] = "Mockingbird";
		arr[23][2] = "Magnolia";
		arr[24][0] = "Missouri";
		arr[24][1] = "Eastern Bluebird";
		arr[24][2] = "Dotted Hawthorn";
		arr[25][0] = "Montana";
		arr[25][1] = "Western Meadowlark";
		arr[25][2] = "Bitterroot";
		arr[26][0] = "Nebraska";
		arr[26][1] = "Western Meadowlark";
		arr[26][2] = "Goldenrod";
		arr[27][0] = "Nevada";
		arr[27][1] = "Mountain Bluebird";
		arr[27][2] = "Big Sagebrush";
		arr[28][0] = "New Hampshire";
		arr[28][1] = "Purple Finch";
		arr[28][2] = "Purple Lilac";
		arr[29][0] = "New Jersey";
		arr[29][1] = "Eastern Goldfinch";
		arr[29][2] = "Violet";
		arr[30][0] = "New Mexico";
		arr[30][1] = "Greater Roadrunner";
		arr[30][2] = "Yucca";
		arr[31][0] = "New York";
		arr[31][1] = "Eastern Bluebird";
		arr[31][2] = "Rose";
		arr[32][0] = "North Carolina";
		arr[32][1] = "Northern Cardinal";
		arr[32][2] = "Dogwood";
		arr[33][0] = "North Dakota";
		arr[33][1] = "Western Meadowlark";
		arr[33][2] = "Wild Prarie Rose";
		arr[34][0] = "Ohio";
		arr[34][1] = "Northern Cardinal";
		arr[34][2] = "Red Carnation";
		arr[35][0] = "Oklahoma";
		arr[35][1] = "Scissor-Tailed Flycatcher";
		arr[35][2] = "Oklahoma Rose";
		arr[36][0] = "Oregon";
		arr[36][1] = "Western Meadowlark";
		arr[36][2] = "Oregon Grape";
		arr[37][0] = "Pennsylvania";
		arr[37][1] = "Ruffed Grouse";
		arr[37][2] = "Mountain Laurel";
		arr[38][0] = "Rhode Island";
		arr[38][1] = "Rhode Island Red";
		arr[38][2] = "Violet";
		arr[39][0] = "South Carolina";
		arr[39][1] = "Carolina Wren";
		arr[39][2] = "Yellow Jessamine";
		arr[40][0] = "South Dakota";
		arr[40][1] = "Ring-Necked Pheasant";
		arr[40][2] = "American Pasque";
		arr[41][0] = "Tennessee"; // There's always one state who needs to compensate......
		arr[41][1] = "Mockingbird and Bobwhite Quail";
		arr[41][2] = "Passion Flower, Iris, Tennessee Coneflower";
		arr[42][0] = "Texas";
		arr[42][1] = "Mockingbird";
		arr[42][2] = "Bluebonnet";
		arr[43][0] = "Utah";
		arr[43][1] = "California Gull";
		arr[43][2] = "Sego Lily";
		arr[44][0] = "Vermont";
		arr[44][1] = "Hermit Thrush";
		arr[44][2] = "Red Clover";
		arr[45][0] = "Virgina";
		arr[45][1] = "Northern Cardinal";
		arr[45][2] = "American Dogwood";
		arr[46][0] = "Washington";
		arr[46][1] = "Willow Goldfinch";
		arr[46][2] = "Coast Rhododendron";
		arr[47][0] = "West Virginia";
		arr[47][1] = "Northern Cardinal";
		arr[47][2] = "Rhododendron";
		arr[48][0] = "Wisconsin";
		arr[48][1] = "American Robin";
		arr[48][2] = "Wood Violet";
		arr[49][0] = "Wyoming";
		arr[49][1] = "Western Meadowlark";
		arr[49][2] = "Indian Paintbrush";
		
		Scanner uInput = new Scanner(System.in); // Initialize scanner for user input
		
		int i; // Initialize variable for hopping through state information array
		int j = 0; // Initialize variable for counting users inputs
		String uInputArray[] = new String[51];
		
		while(true)
		{
			System.out.print("\nEnter the name of the state: ");
			String state = uInput.nextLine(); // Take user input and input to 'state'
			state = state.trim(); // Removes leading/trailing spaces
			
			if(state.equalsIgnoreCase("none")) // How to hande the uwser inputting "none"
			{
				break; // Hard system exit
			}

			for(i = 0; i < arr.length; i++)
			{
				if(state.equalsIgnoreCase(arr[i][0]))
				{
					uInputArray[j] = ("\nState: " + arr[i][0] + "\nBird: " + arr[i][1] + "\nFlower: " + arr[i][2] + "\n"); // Use stepper i as a printer for user input
				}
			}
			
			j++; // Increment counter for output array
		}
		
		for(i = 0; i < j; i++)
			{
				System.out.print(uInputArray[i] + "\n"); // Storing user input into the array to free up nextLine stream for next set of user input
			}
		
		System.exit(0); // Hard program exit
	}
}