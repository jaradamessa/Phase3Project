package restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
	@Test
	public void test3() {
	
	RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/delete";
	
	RequestSpecification  request = RestAssured.given();
	
	Response response = request.delete("/8631");
	
	System.out.println("The rsponse body is "+ response.body().asString());
	Assert.assertEquals(response.getStatusCode(), 200);
	}

}
