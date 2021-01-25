package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reusables.ProjectReusables;
import reusables.SignInPage;

public class TestScript001 extends SignInPage {
	
	@BeforeMethod
	public void executeBeforeTest() throws IOException {
		setPropertyChrome();
		loadInputsfromConfigExcel();
		//launchBrowser();
	}
	
	@Test//Smoke Test
	public void marriottLogin() throws InterruptedException {
		maximizeBrowser();
		enterUrl();
		clickSignInLink();
		enterEmailtextbox();
		enterPassword();
		signIn();
	}
	
	@Test//Regression Test
	public void facebookLogin() throws InterruptedException {
		maximizeBrowser();
		enterUrl();
	}
	
	@AfterMethod
	public void afetrExecution() {
		closeCurrentBrowser();
	}
	
	
}
