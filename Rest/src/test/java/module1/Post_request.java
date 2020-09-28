package module1;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Post_request {
	
	@DataProvider(name="data1")
	public Object[][] data1()
	{
		return new Object[][] {{"morpheus","leader"},{"Pratik","head"}};
	}
	
	@Test(dataProvider = "data1")
	public void post_method(String a , String b)
	{
		Basic_URI.uri();;
		
		JSONObject  jb = new JSONObject();
		jb.put("name", a);
		jb.put("job", b);
		Response response = RestAssured.given().body(jb.toJSONString())
				.when().post("/api/users");
		
		Verify.verify1(response);
	}

}
