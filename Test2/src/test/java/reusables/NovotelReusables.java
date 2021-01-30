package reusables;

import org.openqa.selenium.By;
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
	
	public void buttonLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(Button_logo)).click();
	}
	
	public void login() {
		System.out.println("login");
		driver.findElement(By.xpath(Log_in)).click();
	}
		
	public void userName()
	{
		driver.findElement(By.xpath(Username)).sendKeys("user@5");
	}
	
	public void passWord()
	{
		driver.findElement(By.xpath(Password)).sendKeys("Rocky@1234");
	}
	
	public void closeCurrentBrowser() {
		System.out.println("current browser closed");
		driver.close();
		
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	

}
