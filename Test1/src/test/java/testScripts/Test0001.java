package testScripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reusables.marriottLoginPageReusables;

public class Test0001 extends marriottLoginPageReusables {
	
	@BeforeMethod
	public void executeBeforeTest() throws IOException {
		setPropertyChrome();
		loadInputsfromConfigExcel();
		launchChromeBrowser();
	}
	
	@Test(priority = 1)
	public void marriottLogin() throws InterruptedException {
		maximizeBrowser();
		enterUrl();
		clickSignInLink();
		enterEmailtextbox();
		enterPassword();
		signIn();
	}
	
	//@Test(priority = 2)
	public void facebookLogin() throws InterruptedException {
		maximizeBrowser();
		enterUrl();
	}
	
	@AfterMethod
	public void afetrExecution() {
		closeCurrentBrowser();
	}
	
	
}
