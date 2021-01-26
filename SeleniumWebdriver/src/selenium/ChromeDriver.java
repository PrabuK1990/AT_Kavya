package selenium;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("launch chrome browser");
	}
	
	@Override
	public void get(String URL) {
		System.out.println("enter url in chrome browser : " + URL);
	}

	@Override
	public void sendKeys(String Inputs) {
		System.out.println("enter inputs : " + Inputs);
	}

	@Override
	public void click(String Locators) {
		System.out.println("enter loctors : " + Locators);
	}

	@Override
	public void close() {
		System.out.println("close chrome browser");
		
	}

}
