package module1;

import org.testng.Assert;

import io.restassured.response.Response;

public class Verify {
	
	public static void verify1(Response response)
	{
		
		System.out.println("response: "+ response.asString());
		System.out.println("response code: "+ response.getStatusCode());
		System.out.println("response time: "+ response.getTime());
		System.out.println("response time: "+ response.getBody().asString());
		System.out.println("response time: "+ response.prettyPrint());
		System.out.println("response time: "+ response.contentType());
		Assert.assertEquals(201, response.getStatusCode());
	}

}
