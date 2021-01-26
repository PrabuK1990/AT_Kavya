package reusables;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageReusables extends ProjectReusables {
	
	public void clickSignInLink() throws InterruptedException {
		driver.findElement(By.xpath(HP_SignInJoinLink)).click();
		//Thread.sleep(3000);
	}
	
	public void findHotels(String Dest, String StartDate, String EndDate, String Rooms, String Adults, String Childrens, String Specialrates) throws AWTException, InterruptedException {
		enterDestination(Dest);
		selectStartEndDate();
		verifyRoomsAndGuests();
		verifySpecialRates(Specialrates);
		clickUsePointsCheckbox();
		clickFindHotelsButton();
	}

	public void enterDestination(String Destination) throws AWTException, InterruptedException {
		WebElement enter = driver.findElement(By.name(HP_DestinationTextbox));
		enter.sendKeys(Destination);
		Thread.sleep(2000);
		enter.sendKeys(Keys.ENTER);
//		Robot robo = new Robot();
//		Thread.sleep(2000);
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void clearDestination() {
		driver.findElement(By.name(HP_DestinationTextbox)).clear();
	}

	public void selectStartEndDate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(HP_StartDateArrow)).click();
		WebElement startdate = driver.findElement(By.xpath(HP_StartDate));
		String date = startdate.getAttribute("value");
		LocalDate datepicker = java.time.LocalDate.now();
		String todaysdate = datepicker.toString();
		char lastnumber = todaysdate.charAt(9);
		int a = lastnumber - '0';
		int uu = a +1;
		String expStartDate = "Sun, Jan 2"+uu;	
		//Assert.assertEquals(expStartDate, date);
		System.out.println("Expected Start Date : "+ expStartDate);
		System.out.println("Actual Start Date : "+date);
	}

	public void verifyRoomsAndGuests() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(HP_RoomsAndGuests)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(HP_AddRoomsButton)).click();
	}

	public void verifySpecialRates(String SpecialRate) {
		String specialrate = driver.findElement(By.xpath(HP_SpecialRates)).getText();
		Assert.assertEquals(specialrate, SpecialRate);
	}

	public void clickUsePointsCheckbox() throws InterruptedException {
		driver.findElement(By.name(HP_UsePoints)).click();
		Thread.sleep(1000);}
	
	public void clickFindHotelsButton() {
		driver.findElement(By.xpath(HP_FindHotels)).click();
	}
}
