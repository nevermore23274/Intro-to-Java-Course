/*
 * Filename: headphoneSim
 * Child Of: mainAssignment.java
 * Programmer: Wilson, Tyler
 * Date: 22NOV2020
*/
public class headphoneSim 
{
	// Set variables public static final int
    int LOW = 1;
    int MEDIUM = 2;
    int HIGH = 3;
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private String headphoneColor;
    String currentVolume;
    String statusPluggedIn;

    public headphoneSim(int volume, boolean pluggedIn, String manufacturer, String headPhoneColor) // Main headphoneSim constructor
	{
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
        this.headphoneColor = headPhoneColor;
    }

    public headphoneSim() // 'Default' Constructor for first set of headphones
	{
        volume = MEDIUM;
        pluggedIn = false;
        manufacturer = "Bose";
        headphoneColor = "Black";
    }

    public void setVolume(int volume) // Volume getter
	{
        this.volume = volume;
    }

    public void setPluggedIn(boolean pluggedIn) // pluggedIn getter
	{
        this.pluggedIn = pluggedIn;   
    }

    public void setManufacturer(String manufacturer) // manufacturer getter
	{
        this.manufacturer = manufacturer;
    }

    public void setHeadphoneColor(String headPhoneColor) // headphoneColor getter
	{
        this.headphoneColor = headphoneColor;
    }

    public int getVolume() // getVolume method to decide the meaning between the 3 inputs
	{
        if (volume == 1) 
		{
            currentVolume = "LOW";
        }
        else if (volume == 2) 
		{
            currentVolume = "MEDIUM";
        }
        else 
		{
            currentVolume = "HIGH";
        }
		
        return volume;
    }

    public boolean getPluggedIn() // getPluggedIn method to decide the meaning between the 2 inputs
	{
        if(pluggedIn == true) 
		{
            statusPluggedIn = "Plugged In";
        }
        else 
		{
            statusPluggedIn = "Disconnected";
        }

        return pluggedIn;
    }

    public String getManufacturer() // manufacturer setter
	{
        return manufacturer;
    }

    public String getHeadphoneColor() // headphoneColor setter
	{
        return headphoneColor;
    }

    public void changeVolume(int volume) // volume setter
	{
        setVolume(volume);
    }

    public String toString() // toString method used to return current headphone settings
	{
        int volume = this.getVolume();
        boolean pluggedIn = this.getPluggedIn();
        String manufacturer = this.getManufacturer();
        String headphoneColor = this.getHeadphoneColor();
        String currentVolume = this.currentVolume;

        StringBuilder mainString = new StringBuilder();
        mainString.append(String.format("- Manufacturer: %s\n", manufacturer));
        mainString.append(String.format("- Color: %s\n", headphoneColor));
        mainString.append(String.format("- Status: %s\n", statusPluggedIn));
        mainString.append(String.format("- Volume: %s\n", currentVolume));

        return mainString.toString();
    }    
}