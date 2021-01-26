package selenium;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("launch firefox browser");
	}

	@Override
	public void get(String URL) {
		System.out.println("enter url in firefox browser : " + URL);
		
	}

	@Override
	public void sendKeys(String inputs) {
		System.out.println("enter inputs : " + inputs);
		
	}

	@Override
	public void click(String locators) {
		System.out.println("enter loctors : " + locators);
		
	}

	@Override
	public void close() {
		System.out.println("close firefox browser");
		
	}

}
