package reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import controls.marriottControls;

public class marriottLoginPageReusables implements marriottControls {
	
	public WebDriver driver;

	public void setPropertyChrome() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
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
	
	public void enterPassword() {
		driver.findElement(By.name(Password_Textbox)).sendKeys("");
	}
}

//Implements - Class always implements and interface(It doesn't have methods)
//Extends - Class always extends a class
