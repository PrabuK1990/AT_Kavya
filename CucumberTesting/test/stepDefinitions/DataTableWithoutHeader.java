package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reusbales.NaukriReusables;
import io.cucumber.java.en.Then;

public class DataTableWithoutHeader extends NaukriReusables {
	
	@Before
	public void startSession() {
		launchChromeBrowser();
	}
	
	@Given("I am in mariiott url as {string}")
		public void i_am_in_mariiott_url_as(String url) {
		getNaukriURL(url);
		}

		@When("I enter credentials")
		public void i_enter_credentials(io.cucumber.datatable.DataTable dataTable) {
			List<List<String>> credentials = dataTable.asLists(String.class);
			String desig =  credentials.get(0).get(0);
			String loc =  credentials.get(0).get(1);
			enterDestination(desig);
			enterLocation(loc);
		}
		
		@Then("i can see job lists")
		public void i_can_see_job_lists() throws InterruptedException {
			clickSearchButton();
			verifyText();
		}

		@After
		public void closeSession() {
			closeAllBrowser();
		}



}
