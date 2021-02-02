package reusbales;

import java.io.File;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.Destination;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import controls.NaukriLocators;

public class NaukriReusables implements NaukriLocators{
	
	public WebDriver driver;
	
	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "NaukriResources/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void getNaukriURL(String url) {
		driver.get(url);
	}
	
	public void takeScreenshot() {
		//Object TakesScreenshot;
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\RSK Director\\Kavya\\error.png"));
		//Ashot screenshot = new Ashot().takeScreenshot(driver);
		//ImageIO.write(screenshot.getImage(), "jpg", new File("C:\\Users\\RSK Director\\Kavya"));
	}

	public void enterDestination(String desig) {
		driver.findElement(By.name(DestinationTextbox)).sendKeys(desig);
	}
	
	public void enterLocation(String loc) {
		driver.findElement(By.name(LocationTextbox)).sendKeys(loc);
	}
	
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath(SearchButton)).click();
		Thread.sleep(2000);
	}
	
	public void verifyText() {
		WebElement webelement = driver.findElement(By.xpath(TextValidation));
		String text = webelement.getText();
		if(text.equalsIgnoreCase("Showing jobs for 'software tester, bengaluru'")) {
			System.out.println("Jobs listed");
		}
		else 
			System.out.println("Jobs not listed");
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	
}
