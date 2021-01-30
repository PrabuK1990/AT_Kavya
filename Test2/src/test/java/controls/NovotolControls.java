package controls;

public interface NovotolControls {
	
	public String Button_logo = "//*[local-name()='svg' and @class='button-logo__svg --connected']"; //xpath
	public String Log_in="//button[contains(text(),'Log in')]"; //xpath
	public String Username="//input[@name='username']"; //xpath
	public String Password= "//input[@name='password']"; //xpath
	public String Facebook_logo= "//button[@id='Facebook_btn']/div"; //xpath
}
