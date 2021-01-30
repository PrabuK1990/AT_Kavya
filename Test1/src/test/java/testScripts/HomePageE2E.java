 package testScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import reusables.SignInPage;

public class HomePageE2E extends SignInPage {

	@BeforeMethod
	 @Parameters("browser")  
	public void startSession(String browser) throws IOException, InterruptedException {
		loadInputsfromConfigExcel();
		loadHomePageInputs();
		launchBrowser(browser);
		//maximizeBrowser();
		enterUrl(url);
	}
	
	@Test//Smoke Test
	public void positiveScenario01() throws InterruptedException, AWTException {
		enterDestination(dest);
		selectStartEndDate();
		verifyRoomsAndGuests();
		verifySpecialRates(specialrates);
		clickUsePointsCheckbox();
		clickFindHotelsButton();
	}
	
//	@Test//Regression Test
//	public void NagetiveScenario01() throws InterruptedException, AWTException {
//		enterDestination();
//		selectStartEndDate();
//		verifyRoomsAndGuests();
//		verifySpecialRates();
//		clickUsePointsCheckbox();
//		clickFindHotelsButton();
//	}
	
	@AfterMethod
	public void closeSession() {
		closeCurrentBrowser();
	}
	
}
