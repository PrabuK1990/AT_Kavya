package restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API_Automation {
	
	@BeforeTest
	public void beforeMethod() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
	}
	
	@Test
	public void getDetails() {
		given().when().get().then().statusCode(200);
	}

}
