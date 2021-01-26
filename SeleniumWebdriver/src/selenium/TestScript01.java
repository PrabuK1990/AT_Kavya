package selenium;

public class TestScript01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.sendKeys("Kavya");
		driver.click("xpath");
		driver.close();

	}

}
