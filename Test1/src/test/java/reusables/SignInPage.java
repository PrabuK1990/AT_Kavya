package reusables;

import org.openqa.selenium.By;

public class SignInPage extends HomePageReusables {
	
	public void signInOrJoin()
	{
		driver.findElement(By.xpath(Sign_In_Account_val)).click();
	}
	
	public void enterEmailtextbox() {
	    driver.findElement(By.id(Email_Textbox)).sendKeys(usr);	
	}
	
	public void enterPassword() {
		driver.findElement(By.name(Password_Textbox)).sendKeys(pass);
	}
	
	public void signIn() {
		driver.findElement(By.xpath(SignIn)).click();
		
	}
	
	public void signInError()
	{
		String signinError =driver.findElement(By.xpath(SignIn_Error)).getText();
		System.out.println(signinError);
	}

}


