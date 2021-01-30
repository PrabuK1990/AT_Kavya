package controls;

public interface MarriottControls {
	
	//Locators for Home Page
	public String HP_SignInJoinLink = "//span[text()='Sign In or Join']"; //Xpath
	public String HP_DestinationTextbox = "destinationAddress.destination"; //name
	public String HP_StartDate = "//input[@class='ccheckin l-h-field-input l-no-outline ']"; //xpath
	public String HP_StartDateArrow = "//label[text()='Check-in']/preceding-sibling::div/span[2]"; //xpath
	public String HP_EndDate = "//input[@placeholder='Check-out']"; //xpath
	public String HP_RoomsAndGuests = "//p[@class='l-display-text']"; //xpath
	public String HP_AddRoomsButton = "//a[@aria-label='Add Rooms']"; //xpath
	public String HP_GetRoomText = "//a[@aria-label='Add Adults Per Room']"; //xpath
	public String HP_SpecialRates = "//span[text()='None']"; //xpath
	public String HP_UsePoints = "useRewardsPoints"; //name
	public String HP_FindHotels = "//div[@id='rewards-use-search']/ancestor::div[2]/following-sibling::div/button"; //xpath
	
	//Locators for Signin Page
	public String Welcome_Marriott_Bonvey_val = "//h2[contains(text(),'Welcome to Marriott Bonvoy')]"; //xpath
	public String Sign_In_Account_val= "//h3[contains(text(),'Sign in to your account')]"; //xpath
	public String Email_Yextbox_Val = "//label[@for='user-id']"; //xpath
	public String Email_Textbox = "user-id"; //Id
	public String Password_Textbox_val = "//label[@for='password']"; //xpath
	public String Password_Textbox = "password"; //Name
	public String Remember_chkbox = "remember-me"; //Id
	public String Remember_chkbox_val = "//label[@for='remember-me']"; //Xpath
	public String SignIn = "//button[text()=' Sign In ']"; //xpath
	public String SignIn_Error = "SignInErrorComponent_01_b947"; //Id
	public String Join_Marriott_Bonvoy = "//h3[contains(text(),'Join Marriott Bonvoy')]"; //xpath
	public String Login_Facebook = "//div[@title='Sign in to your account with Facebook']"; //xpath
	public String JoinNow_Button = "//a[text()=' Join Now  ']"; //xpath
	
	//Locators for My Trip
	public String MyTrips = "//span[contains(text(),'My Trips')]"; //Xpath
	public String Look_up_Reservation = "//h3[contains(text(),'Look up a reservation')]"; //Xpath
	public String Reservation_text = "//p[contains(text(),'After completing')]"; //Xpath
	public String Confirmation_Num_Validation = "//label[contains(text(),'Confirmation Number')]"; //Xpath
	public String confirmation_Num = "confirmationNumber"; //Id
	public String Check_in_validation = "//label[text()='Check-in Date']"; //Xpath
	public String Check_In = "//input[@id='cInDate']"; //Xpath
	public String First_name_validation = "//label[text()='First Name']"; //Xpath
	public String First_name = "firstName"; //Id
	public String Last_name_validation = "//label[text()='Last Name']"; //Xpath
	public String Last_name = "lastName"; //Id
	public String Find_Reservation = "//button[@id='find-reservaton']"; //Xpath
	public String Sign_in_account = "//h3[contains(text(),'Sign in to your account')]"; //Xpath
	public String Email_memName_validation = "//label[@for='user-id']"; //Xpath
	public String Email_memName = "//input[@id='user-id']"; //Xpath
	public String Password_validation = "//label[@for='password']"; //Xpath
	public String Password = "//input[@id='password']"; //Xpath
	public String Remember_Me_Validation = "//label[@for='remember-me']"; //Xpath
	public String Remember_Me_Chkbox = "//input[@id='remember-me']"; //Xpath
	public String Sign_In_Trips = "//button[@name='submitButton']"; //Xpath
	public String Forgot_Password = "//div[@id='email-validation']/following-sibling::div[4]/a"; //Xpath
	public String Activate_Online_Account = "//div[@id='email-validation']/following-sibling::div[5]/a"; //Xpath
	public String Close_Symbol = "//button[@class='m-modal-close mfp-close is-hover-fix']"; //Xpath
	
	
	//Locators for Create Account Page
	public String English_link = "//li[@id='QuickLinkItembd62']/a/span[2]"; //Xpath
	public String Help_Link = "//span[contains(text(),'Help')]"; //Xpath
	public String Marriott_Bonvoy_Link = "//div[@id='ProgramLogo19fe']/div/a"; //Xpath
	public String FindReserve_Link = "//p[contains(text(),'Find & Reserve')]"; //Xpath
	public String SpecialOffers_Link = "//p[contains(text(),'Special Offers')]"; //Xpath
	public String Vacations_Link = "//p[contains(text(),'Vacations')]"; //Xpath
	public String OurBrands_Link = "//p[contains(text(),'Our Brands')]"; //Xpath
	public String About_Marriott_Bonvoy_Link = "//p[contains(text(),'About Marriott Bonvoy')]"; //Xpath
	public String Join_Marriott_Bonvoy_Link = "//h1[contains(text(),'Join Marriott Bonvoy')]"; //Xpath
	public String Sign_with_Facebook = "//div[@title='Join with your social account now']"; //Xpath
	public String Join_Socil_Account_Val = "//span[contains(text(),'Join with your social account now')]"; //Xpath
	public String Or = "//span[text()='or']"; //Xpath
	public String First_Name_Val = "//label[contains(text(),'First Name')]"; //Xpath
	public String First_Name = "field-first-name"; //Id
	public String Last_Name_Val = "//label[contains(text(),'Last Name')]"; //Xpath
	public String Last_Name = "field-last-name"; //Id
	public String Country_Val = "//label[contains(text(),'Country/Region')]"; //Xpath
	public String Country = "//div[@class='selectric']"; //Xpath
	public String Zip_Code_Val = "//label[contains(text(),'Zip/Postal code')]"; //Xpath
	public String Zip_code = "field-postal"; //ID
	public String Email_Val = "//span[text()='Email']"; //Xpath
	public String Email = "//input[@id='field-email']"; //Xpath
	public String Password_Val = "//label[contains(text(),'Password')]"; //Xpath
	public String Password_field = "//input[@id='field-password']"; //Xpath
	public String Confirm_Password_Val = "//label[contains(text(),'Confirm password')]"; //Xpath
	public String Confirm_Password = "//input[@id='field-password-confirmation']"; //Xpath
	public String Rememberme_chkbox = "//input[@id='field-remember-me']"; //Xpath
	public String Rememberme_Val = "//label[contains(text(),'Remember me')]"; //Xpath
	public String Join_Enroll = "//button[@id='enroll-join']"; //Xpath
	public String Cancel = "js-cancel"; //Id
	public String Already_Member_Val = "//p[contains(text(),'Already a Member?')]"; //Xpath
	public String Activate_Online_Account_Link = "//a[contains(text(),'Activate online account')]"; //Xpath
	public String Unlock_Stay_text = "//div[contains(text(),'Unlock your stay with the Marriott Bonvoy� App')]"; //Xpath
	public String Learn_More_Link = "//span[contains(text(),'Learn More')]"; //Xpath
	public String Facebook_Linktext = "https://www.facebook.com/marriottbonvoy"; //LinkText
	public String Instagram_Linktext = "https://www.instagram.com/marriottbonvoy"; //LinkText
	public String Twitter_linktext = "https://www.twitter.com/marriottbonvoy"; //LinkText
	public String Messenger_Linktext = "https://www.messenger.com/t/marriottbonvoy"; //LinkText
	public String Youtube_linktext = "https://www.youtube.com/marriott"; //LinkText
	public String Mobile_Image = "//div[@class='mtAppAdBannerImg']/../../../..//img"; //doubt
	//public String Top_destination_drpdown = "//div[@id='TransactionalFooterLinks3268']/div/section/div/a/p/span/span[2]"; //Xpath (doubt)
	public String Top_destination_drpdown = "h2[text()='Top Destinations']/following-sibling::p/span/span[2]";

}
