package reusables;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import controls.marriottControls;

public class marriottLoginPageReusables implements marriottControls {
	
	public static WebDriver driver;

	public static void setPropertyChrome() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
	}
	
	public static void launchChromeBrowser() {
		driver = new ChromeDriver();
	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void enterUrl() {
		driver.get("https://www.marriott.com/default.mi");
	}
	
	public static void clickSignInLink() throws InterruptedException {
		driver.findElement(By.xpath(SignInJoin_Link)).click();
		Thread.sleep(3000);
	}
	
	public static void closeCurrentBrowser() {
		driver.close();
	}
	
	public static void closeAllBrowser() {
		driver.quit();
	}
	
	public static void enterPassword() {
		driver.findElement(By.name(Password_Textbox)).sendKeys("");
	}
}

//Implements - Class always implements and interface(It doesn't have methods)
//Extends - Class always extends a class
