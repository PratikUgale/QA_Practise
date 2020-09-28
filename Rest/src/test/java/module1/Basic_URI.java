package module1;

import io.restassured.RestAssured;

public class Basic_URI {
	
	public static void uri()
	{
		
		RestAssured.baseURI="https://reqres.in";
		System.out.println("UrI selected and worked successfully");
		
	}

}
