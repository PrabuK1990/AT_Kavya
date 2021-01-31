package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusbales.NaukriReusables;

public class NaukriSearch extends NaukriReusables {

	@Before
	public void startSession() {
		launchChromeBrowser();
	}

	@Given("user navigated to naukri url using {string}")
	public void user_navigated_to_naukri_url_using(String url) {
		getNaukriURL(url);
	}

	@When("he enters designation as {string} and location as {string}")
	public void he_enters_designation_as_and_location_as(String desig, String loc) {
		enterDestination(desig);
		enterLocation(loc);
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		clickSearchButton();
	}

	@Then("it should list jobs available")
	public void it_should_list_jobs_available() {
		verifyText();
	}

	@After
	public void closeSession() {
		closeAllBrowser();
	}

}
