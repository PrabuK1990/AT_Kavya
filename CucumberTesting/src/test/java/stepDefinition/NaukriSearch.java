package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaukriSearch {
	
		@Given("user navigated to naukri url using {string}")
		public void user_navigated_to_naukri_url_using(String url) {
		    System.out.println("The url mentioned in feature file is : " +  url);
		}

		@When("he enters designation as {string} and location as {string}")
		public void he_enters_designation_as_and_location_as(String desig, String loc) {
			 System.out.println("Designation is : " + desig + "Location is : "+ loc);
		}
		
		@When("click on search button")
		public void click_on_search_button() {
			 System.out.println("When 2");
		}
		
		@Then("it should list jobs available")
		public void it_should_list_jobs_available() {
			 System.out.println("Then");
		}

}
