package testScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reusables.SignInPage;

public class HomePageE2E extends SignInPage {

	@BeforeMethod
	public void startSession() throws IOException, InterruptedException {
		setPropertyChrome();
		loadInputsfromConfigExcel();
		loadHomePageInputs();
		launchChromeBrowser();
		maximizeBrowser();
		enterUrl();
	}
	
	@Test
	public void positiveScenario01() throws InterruptedException, AWTException {
		enterDestination();
		selectStartEndDate();
		verifyRoomsAndGuests();
		verifySpecialRates();
		clickUsePointsCheckbox();
		clickFindHotelsButton();
	}
	
	@AfterMethod
	public void closeSession() {
		closeCurrentBrowser();
	}
	
}
