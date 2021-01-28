package testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusables.NovotelReusables;


public class TestRunner01 extends NovotelReusables {
	
@BeforeTest
	public void startSession() {
		launchBrowser();
		maximizeBrowser();
		enterUrl();
	}

@Test
public void Test001()
{
	System.out.println("test1 success");
}
	
@AfterTest
	public void closeSession() {
		closeCurrentBrowser();
	}



	

}
