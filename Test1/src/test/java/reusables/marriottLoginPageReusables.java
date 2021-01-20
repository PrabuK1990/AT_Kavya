package reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import controls.marriottControls;

public class marriottLoginPageReusables implements marriottControls {
	
	public WebDriver driver;

	public void setPropertyChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSK Director\\Kavya\\kavya Eclipse\\chromedriver.exe");
	}
	
	public void launchChromeBrowser() {
		driver = new ChromeDriver();
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	public void clickSignInLink() throws InterruptedException {
		driver.findElement(By.xpath(SignInJoin_Link)).click();
		Thread.sleep(3000);
	}
	
	public void closeCurrentBrowser() {
		driver.close();
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	
	public void enterEmailtextbox() {
	    driver.findElement(By.id(Email_Textbox)).sendKeys("marriott@123");	
	}
	
	public void enterPassword() {
		driver.findElement(By.name(Password_Textbox)).sendKeys("12345");
	}
	
	public void signIn() {
		driver.findElement(By.xpath(SignIn)).click();
		
	}
}

//Implements - Class always implements and interface(It doesn't have methods)
//Extends - Class always extends a class
