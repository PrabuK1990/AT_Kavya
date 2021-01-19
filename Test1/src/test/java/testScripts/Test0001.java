package testScripts;

import reusables.marriottLoginPageReusables;

public class Test0001 extends marriottLoginPageReusables {

	public static void main(String[] args) throws InterruptedException {
		
		setPropertyChrome();
		launchChromeBrowser();
		maximizeBrowser();
		enterUrl();
		clickSignInLink();
		closeCurrentBrowser();
	}
}
