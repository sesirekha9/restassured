package rest_testing;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class testID {
	public static String baseurl="https://reqres.in";	
	public String id;
	@Test()
	public void createBoard()
	{
		RestAssured.baseURI=baseurl;
	Response response=given().queryParam("name", "venkat")
		.queryParam("key", "713e187abb4cf6d32013ce3022fc6df3")
		.queryParam("token", "f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225")
		.header("Content-Type", "application/json")
		.when()
		.post("/1/boards/")
		.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON)
		.extract().response();
		String jsonresponse = response.asString();
		JsonPath js= new JsonPath(jsonresponse);
		
		id = js.get("id");
		System.out.println(id);		
	}
	public void delete() {
		Response response=given().queryParam("name", "venkat")
				.queryParam("key", "713e187abb4cf6d32013ce3022fc6df3")
				.queryParam("token", "f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225")
				.header("Content-Type", "application/json")
				.when()
				.post("/1/boards/")
				.then()
				.assertThat().statusCode(200).contentType(ContentType.JSON)
				.extract().response();
				String jsonresponse = response.asString();
				JsonPath js= new JsonPath(jsonresponse);
				
				id = js.get("id");
				System.out.println(id);		
		
	}

}
