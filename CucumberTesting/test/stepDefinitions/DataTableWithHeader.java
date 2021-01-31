package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reusbales.NaukriReusables;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

import io.cucumber.java.After;

public class DataTableWithHeader extends NaukriReusables{
	
	@Before
	public void startSession() {
		launchChromeBrowser();
	}
	
		@Given("We are in mariiott page and the url is {string}")
		public void we_are_in_mariiott_page_and_the_url_is(String url) {
			getNaukriURL(url);
		}

		@When("We enter intputs in the home page")
		public void we_enter_intputs_in_the_home_page(io.cucumber.datatable.DataTable dataTable) {
			List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
			String desig =  credentials.get(0).get("Designation");
			String loc =  credentials.get(0).get("Location");
			enterDestination(desig);
			enterLocation(loc);
		}
		
		
		@Then("We can see job lists based ont the inputs entered")
		public void we_can_see_job_lists_based_ont_the_inputs_entered() throws InterruptedException {
			clickSearchButton();
			verifyText();
		}
		
		@After
		public void closeSession() {
			closeAllBrowser();
		}
}
