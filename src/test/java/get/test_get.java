package get;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test_get 
{
	
	
 @Test
	public void Test_01()
	{
	 //to store response in variable
		Response response=get("https://run.mocky.io/v3/8f78d510-b143-4215-beaa-49a9a205d038");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statuscode=response.getStatusCode();
		
		Assert.assertEquals(statuscode,200);
	}
 
 @Test
 public void Test_02()
 {
	 given()
	     .get("https://reqres.in/api/users?page=2")
	 .then()
	       .statusCode(200)
	       .body("data.id[0]",equalTo(7));
 }
}
