public class USCrimeMethods
{
	// Population Growth Method
    static void disPopPct(USCrime[] data)
	{
		float gRate;
		System.out.println("Population Growth Year to Year");
		System.out.println("********************************" + "\n");
		for (int i = 0; i < data.length - 1; i++)
		{
			gRate = 100 * (float) (data[i + 1].getPopulation() - data[i].getPopulation()) / data[i].getPopulation();
			System.out.println("From " + data[i].getYear() + " to " + data[i + 1].getYear() + " the population growth was " 
			+ String.format("%.4f", gRate) + "%.");
		}
    }
	//Max Murder Method
	public static int maxMurRteYr(USCrime[] data) 
	{
		int year = 0;
		float maxRte = 0;
		for (USCrime crime : data)
		{
			if (crime.getMurderRate() > maxRte)
			{
				maxRte = crime.getMurderRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
	public static float maxMurRte(USCrime[] data)
	{
		int year = 0;
		float maxRte = 0;
		for (USCrime crime : data)
		{
			if (crime.getMurderRate() > maxRte)
			{
				maxRte = crime.getMurderRate();
				year = crime.getYear();
			}
		}
		
		return maxRte;
	}

    //Minimum Murder Method
    public static int minMurRteYr(USCrime[] data) 
	{
		int year = 0;
		float minRte = data[0].getMurderRate();
		for (USCrime crime : data)
		{
			if (crime.getMurderRate() < minRte)
			{
				minRte = crime.getMurderRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float minMurRte(USCrime[] data)
	{
		int year = 0;
		float minRte = data[0].getMurderRate();
		for (USCrime crime : data)
		{
			if (crime.getMurderRate() < minRte)
			{
				minRte = crime.getMurderRate();
				year = crime.getYear();
			}
		}
		
		return minRte;
    }
    
    //Maximum Robbery Method
    public static int maxRobRteYr(USCrime[] data)
	{
		int year = 0;
		float maxRte1 = 0;
		for (USCrime crime : data)
		{
			if (crime.getRobberyRate() > maxRte1)
			{
				maxRte1 = crime.getRobberyRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float maxRobRte(USCrime[] data)
	{
		int year = 0;
		float maxRte1 = 0;
		for (USCrime crime : data)
		{
			if (crime.getRobberyRate() > maxRte1)
			{
				maxRte1 = crime.getRobberyRate();
				year = crime.getYear();
			}
		}
		
		return maxRte1;
    }

    //Minimum Robbery Method
    public static int minRobRteYr(USCrime[] data)
	{
		int year = 0;
		float minRte1 = data[0].getRobberyRate();
		for (USCrime crime : data)
		{
			if (crime.getRobberyRate() < minRte1)
			{
				minRte1 = crime.getRobberyRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float minRobRte(USCrime[] data)
	{
		int year = 0;
		float minRte1 = data[0].getRobberyRate();
		for (USCrime crime : data)
		{
			if (crime.getRobberyRate() < minRte1)
			{
				minRte1 = crime.getRobberyRate();
				year = crime.getYear();
			}
		}
		
		return minRte1;
    }

    //Maximum Burglary Method
    public static int maxBurRteYr(USCrime[] data)
	{
		int year = 0;
		float maxRte2 = 0;
		for (USCrime crime : data)
		{
			if (crime.getBurglaryRate() > maxRte2)
			{
				maxRte2 = crime.getBurglaryRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float maxBurRte(USCrime[] data)
	{
		int year = 0;
		float maxRte2 = 0;
		for (USCrime crime : data)
		{
			if (crime.getBurglaryRate() > maxRte2)
			{
				maxRte2 = crime.getBurglaryRate();
				year = crime.getYear();
			}
		}
		
		return maxRte2;
    }

    //Minimum Robbery Method
    public static int minBurRteYr(USCrime[] data)
	{
		int year = 0;
		float minRte2 = data[0].getBurglaryRate();
		for (USCrime crime : data)
		{
			if (crime.getBurglaryRate() < minRte2)
			{
				minRte2 = crime.getBurglaryRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float minBurRte(USCrime[] data)
	{
		int year = 0;
		float minRte2 = data[0].getBurglaryRate();
		for (USCrime crime : data)
		{
			if (crime.getBurglaryRate() < minRte2)
			{
				minRte2 = crime.getBurglaryRate();
				year = crime.getYear();
			}
		}
		
		return minRte2;
    }

    //Maximum Rape Method
    public static int maxRapRteYr(USCrime[] data)
	{
		int year = 0;
		float maxRte3 = 0;
		for (USCrime crime : data)
		{
			if (crime.getRapeRate() > maxRte3)
			{
				maxRte3 = crime.getRapeRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float maxRapRte(USCrime[] data)
	{
		int year = 0;
		float maxRte3 = 0;
		for (USCrime crime : data)
		{
			if (crime.getRapeRate() > maxRte3)
			{
				maxRte3 = crime.getRapeRate();
				year = crime.getYear();
			}
		}
		
		return maxRte3;
    }

    //Minimum Rape Method
    public static int minRapRteYr(USCrime[] data)
	{
		int year = 0;
		float minRte3 = data[0].getRapeRate();
		for (USCrime crime : data)
		{
			if (crime.getRapeRate() < minRte3)
			{
				minRte3 = crime.getRapeRate();
				year = crime.getYear();
			}
		}
		
		return year;
    }
	
    public static float minRapRte(USCrime[] data)
	{
		int year = 0;
		float minRte3 = data[0].getRapeRate();
		for (USCrime crime : data)
		{
			if (crime.getRapeRate() < minRte3)
			{
				minRte3 = crime.getRapeRate();
				year = crime.getYear();
			}
		}
		
		return minRte3;
    }
}