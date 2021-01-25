package reusables;

import org.openqa.selenium.By;

public class SignInPage extends HomePageReusables {
	
	public void enterEmailtextbox() {
	    driver.findElement(By.id(Email_Textbox)).sendKeys(usr);	
	}
	
	public void enterPassword() {
		driver.findElement(By.name(Password_Textbox)).sendKeys(pass);
	}
	
	public void signIn() {
		driver.findElement(By.xpath(SignIn)).click();
		
	}

}


