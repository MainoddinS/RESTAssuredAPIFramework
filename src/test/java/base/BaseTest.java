package base;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import configuration.ConfigurationManager;

import io.restassured.RestAssured;

public class BaseTest {
	
	//Service URLs:
	public static final String GOREST_ENDPOINT = "/public/v2/users";
	
	protected ConfigurationManager config;
	protected Properties prop;
	protected String baseURI;
	
	
	@BeforeTest
	public void setUp(String baseURI) {
		
		config = new ConfigurationManager();
		prop = config.initProp();
		baseURI=prop.getProperty("BaseURI");
		this.baseURI = baseURI;
		System.out.println(baseURI);
	}
	
}
