package controls;

public interface marriottControls {
	
	public String SignInJoin_Link = "//span[text()='Sign In or Join']"; //Xpath
	public String Email_Textbox = "user-id"; //Id
	public String Password_Textbox = "password"; //Name
	public String SignIn = "//button[text()=' Sign In ']"; //xpath
	public String Destination = "destinationAddress.destination"; //name
	public String StartDate = "//input[@placeholder='Check-in']"; //xpath
	public String EndDate = "//input[@placeholder='Check-out']"; //xpath
	public String RoomsAndGuests = "//p[@class='l-display-text']"; //xpath
	public String SpecialRates = "//span[text()='None']"; //xpath
	public String UsePoints = "useRewardsPoints"; //name
	public String FindHotels = "///div[@id='rewards-use-search']/ancestor::div[2]/following-sibling::div/button"; //xpath
	
	//add 14 locators for sinin page
	//add locators for create account page
	//add 21 locators for mytrips

}
