/*
* Assignment: Week 6 Discussion Post
* Programmer: Tyler Wilson
* Date: 28NOV2020
* Parameters:
*    + Class based on household object: Toaster
*        - Must have at least one additional method
*        - Use boolean isOn as a switch
*        - Must use constructor
*    + Demonstrate functionality
*/
//Imports

class HomeToaster // Set class for household object
{
	private boolean isOn;
	
	public HomeToaster() // Constructor
	{
		this.isOn = true;
	}
	
	public void toast()
	{
		this.isOn = !this.isOn; // Invert, then reassign (found on StackOverflow, neat way of doing it)
	}
	
	public String status()
	{
		String toasterStatus = isOn ? "On" : "Off";
		return "Toaster is: " + toasterStatus;
	}
	
	public static void main(String[] args)
	{
		HomeToaster toastie = new HomeToaster(); // Create object of toaster class
		
		// Call methods
		System.out.println(toastie.status());
		toastie.toast(); // Create new instance for next output
		System.out.println(toastie.status());
	}
}