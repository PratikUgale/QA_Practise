package module1;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	@Test()
	public void first_get()
	{
		RestAssured.baseURI="https://reqres.in";
		Response response= RestAssured.given().param("Page", 2)
				.when().get("/api/users");
		
		System.out.println("response: "+ response.asString());
		System.out.println("response code: "+ response.getStatusCode());
		System.out.println("response time: "+ response.getTime());
		System.out.println("response time: "+ response.getBody().asString());
		System.out.println("response time: "+ response.prettyPrint());
		System.out.println("response time: "+ response.contentType());
		Assert.assertEquals(200, response.getStatusCode());
		
		
		
				
		
	}
	
	

}
