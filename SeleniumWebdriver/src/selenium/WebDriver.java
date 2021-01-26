package selenium;

public interface WebDriver {

	public void get(String url);
	
	public void sendKeys(String inputs);
	
	public void click(String locators);
	
	public void  close();
	
}
