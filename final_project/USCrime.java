public class USCrime 
{

    // Declare Variables
    private float mRate;
    private float rRate;
    private int pCrime;
    private int population;
    private int year;
    private float bRate;
    private float rpRate;	
    
    // Main constructor
    public USCrime(int year) 
    {
		this.year = year;
    }

    // Getters	
    public float getMurderRate()
	{
		return mRate;
    }
	
    public float getRobberyRate()
	{
		return rRate;
    }
	
    public int getPopulation()
	{
		return population;
    }
	
    public int getYear()
	{
		return year;
    }
	
    public float getBurglaryRate()
	{
		return bRate;
    }
	
    public float getRapeRate()
	{
		return rpRate;
    }
    
    // Setters
    public void setMurderRate(float mRate)
	{
		this.mRate = mRate;
    }
	
    public void setRobberyRate(float rRate)
	{
		this.rRate = rRate;
    }
	
    public void setPopulation(int population)
	{
		this.population = population;
    }
	
    public void setBurglaryRate(float bRate)
	{
		this.bRate = bRate;
    }
	
    public void setRapeRate(float rpRate)
	{
		this.rpRate = rpRate;
    }
}