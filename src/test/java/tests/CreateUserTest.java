package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

public class CreateUserTest {

	@Test
	public void addNewUser() {
//		RestAssured.baseURI = "https://gorest.co.in";
		
//		User user = new User("Naveen", getRandomEmailId(), "male", "active");

		String jsonBody = "{" +
                "   \"name\":\"Test Automation\",\n" +
                "   \"email\":\"testAutomation303@gmail.com\",\n" +
                "   \"gender\":\"Male\",\n" +
                "   \"status\":\"active\"\n" +
                "}";
		
		given().log().all()
		.header("Authorization", "Bearer c3c7842cea56c6c93309e0d45365437d6e84771dc68fc97ed24a080c9bcd98f0")
	    .accept(ContentType.JSON)
	    .contentType(ContentType.JSON)
	    .and().body(jsonBody)
		
		.when().log().all()
		.post("https://gorest.co.in/public-api/users")
		
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK)
		.and()
		.body("data.name", equalTo("Test Automation"));
	    
	}
}
