package restAPI;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleEmployee {
	
	@Test
	public void test() {

		RestAssured.baseURI= "https://dummy.restapiexample.com/api/v1/employee/1";

		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.body().asString();
		System.out.println(responseBody.contains("Tiger Nixon"));
		//Assert.assertTrue(responseBody.contains("Pankaj"));

		System.out.println("Response code is " + response.statusCode());


		Assert.assertEquals(response.statusCode(), 200);
	
	
	}

}
