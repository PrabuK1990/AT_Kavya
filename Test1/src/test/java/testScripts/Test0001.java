package testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reusables.marriottLoginPageReusables;

public class Test0001 extends marriottLoginPageReusables {
	
	@BeforeMethod
	public void executeBeforeTest() {
		setPropertyChrome();
		launchChromeBrowser();
	}
	
	@Test(priority = 1)
	public void marriottLogin() throws InterruptedException {
		maximizeBrowser();
		enterUrl("https://www.marriott.com/default.mi");
		clickSignInLink();
	}
	
	@Test(priority = 2)
	public void facebookLogin() throws InterruptedException {
		maximizeBrowser();
		enterUrl("https://www.facebook.com");
	}
	
	@AfterMethod
	public void afetrExecution() {
		closeCurrentBrowser();
	}
	
	
}
