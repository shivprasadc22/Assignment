package get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class pra1 
{

	@Test
	public void get()
	{
		RestAssured.baseURI="https://reqres.in/api/";
		given().log().all().
		when().get("users?page=2").
		then().
		statusCode(200).
		log().all();
		
	}
}
