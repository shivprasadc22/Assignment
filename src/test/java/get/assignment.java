package get;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class assignment 
{
	
	public boolean data()
	{
		int count=0;
		for(int i=0;i<11;i++)
		{
			String re=given().when().get("https://run.mocky.io/v3/8f78d510-b143-4215-beaa-49a9a205d038").
					then().extract().path("player["+i+"]country");
			
			if(!re.equals("India"))
			{
				System.out.println(re+" ");
				count++;
				
			}
			if(count>=4)
			{
				System.out.println("json has 4 or more players out of india");
				return true;
			}
		}
		return false;
	}
	@Test
 public void jsons()
 {
	 boolean dt=data();
	 if(dt==true)
	 {
		 System.out.println("json has 4 or more players out of india");
	 }
 }
}
