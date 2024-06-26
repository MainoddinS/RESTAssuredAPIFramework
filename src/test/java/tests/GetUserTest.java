package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest {

	@Test
	public void getAllUsers() {
		RestAssured.baseURI = "https://gorest.co.in";
		Response response = given()
				        .header("Authorization", "Bearer c3c7842cea56c6c93309e0d45365437d6e84771dc68fc97ed24a080c9bcd98f0")
	                    .when()
	                    .get("/public/v2/users/3");
	
		JsonPath js = response.jsonPath();
		System.out.println(js.getInt("id"));
		System.out.println(js.getString("email"));
	}
}
