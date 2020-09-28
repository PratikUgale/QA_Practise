package module1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OATH {
	
	@Test
	public void auth()
	{
		RestAssured.baseURI="https://restapi.demoqa.com";
		Response response = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword")
				.when().get("/authentication/CheckForAuthentication/");
		
		//For third party login with token or access key
		//Response response = RestAssured.given().auth().oauth(consumerKey, consumerSecret, accessToken, secretToken);
		
		System.out.println("response: "+ response.asString());
		System.out.println("response code: "+ response.getStatusCode());
		System.out.println("response time: "+ response.getTime());
		System.out.println("response time: "+ response.getBody().asString());
		System.out.println("response time: "+ response.prettyPrint());
		System.out.println("response time: "+ response.contentType());
		Assert.assertEquals(200, response.getStatusCode());
		
	}

}
