package module1;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Request_with_param {
	
	@Test
	public void verify_header()
	{
		RestAssured.baseURI="https://reqres.in";
		
		JSONObject js = new JSONObject();
		js.put("name", "morpheus");
		js.put("job", "zion resident");
		Response response = RestAssured.given().body(js).params("page", 2)
				.when().put("/api/users");
		
		System.out.println("response: "+ response.asString());
		System.out.println("response code: "+ response.getStatusCode());
		System.out.println("response time: "+ response.getTime());
		System.out.println("response time: "+ response.getBody().asString());
		System.out.println("response time: "+ response.prettyPrint());
		System.out.println("response time: "+ response.contentType());
		Assert.assertEquals(200, response.getStatusCode());
						
			
	}

}
