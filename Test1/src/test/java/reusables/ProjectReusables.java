package reusables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import controls.MarriottControls;
import resources.LoadExcel;

public class ProjectReusables extends LoadExcel implements MarriottControls {
	
	public WebDriver driver;

	//Set property  for chrome and Path to chromedriver
	public void setPropertyChrome() {
		
	}
	
	//Launch automated chrome browser
	public void launchBrowser(String brow) {
		if(brow.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
			driver = new ChromeDriver();
		}	
		
		else if(brow.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
			driver = new FirefoxDriver();
		}
		
		else if(brow.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
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
