package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import controls.NovotolControls;


public class NovotelReusables implements NovotolControls {
	
	public WebDriver driver;
	
	//Launch automated chrome browser
	public void launchBrowser() {
		
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			driver = new ChromeDriver();	
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	//Maximise the opened browser
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	//Enter the url from excel
	public void enterUrl() {
		driver.get("https://novotel.accor.com/gb/usa/index.shtml");
	}
			
	public void closeCurrentBrowser() {
		System.out.println("current browser closed");
		driver.close();
		
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	

}
