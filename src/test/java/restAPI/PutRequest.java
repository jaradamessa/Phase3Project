package restAPI;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	@Test
	public void test2() {
		
		HashMap<String,String> obj = new HashMap<String,String>();
		
		obj.put("name", "Jara Jara");
		obj.put("salary", "123000");
		obj.put("age", "31");
		obj.put("id", "8631");
		
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/update";
		
		RequestSpecification  request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body(obj)
									.put("/8631");
		
		System.out.println("The response code is " + response.getStatusCode());
		
		System.out.println("The response body is " + response.body().asString());
									
		
	}



}
