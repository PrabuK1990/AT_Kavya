package reusables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import controls.MarriottControls;
import resources.LoadExcel;

public class ProjectReusables extends LoadExcel implements MarriottControls {
	
	public WebDriver driver;

	//Set property  for chrome and Path to chromedriver
	public void setPropertyChrome() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
	}
	
	//Launch automated chrome browser
	public void launchChromeBrowser() {
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	//Maximise the opened browser
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	//Enter the url from excel
	public void enterUrl() throws InterruptedException {
		driver.get(url);
	}
	
	public void closeCurrentBrowser() {
		driver.close();
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
}

//Implements - Class always implements and interface(It doesn't have methods)
//Extends - Class always extends a class
