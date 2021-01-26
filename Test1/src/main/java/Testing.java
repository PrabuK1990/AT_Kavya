import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(true);
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		System.out.println("Maximize window");
		driver.get("https://www.marriott.com/default.mi");
		System.out.println("Enter url");
		driver.findElement(By.xpath("//span[text()='Sign In or Join']")).click();
		System.out.println("Click Signin");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Quit Browser");
	}

}
