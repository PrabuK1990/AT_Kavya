import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marriott.com/default.mi");
		driver.findElement(By.xpath("//span[text()='Sign In or Join']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
