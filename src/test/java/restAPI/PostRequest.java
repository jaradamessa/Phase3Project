package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
	@Test
	public void test1() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/create";
		RequestSpecification request = RestAssured.given();

		Response response = request.contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\r\n"
						+ "    \"name\": \"Jara Jara\",\r\n"
						+ "    \"salary\": \"123000\",\r\n"
						+ "    \"age\": 31\r\n"
						+ "}").post();
		System.out.println("The respose code is " + response.getStatusCode());
		System.out.println("The response code is " + response.body().asString());
	}
}
	



