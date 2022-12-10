package rest_testing;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class trellotest {
	public String url="https://trello.com/";
	public String key="713e187abb4cf6d32013ce3022fc6df3";
	public String token="f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225";
	public String id;// to create,update,delete ID
	
	@Test(enabled=false)
	public void tc1() {
		JSONObject js=new JSONObject();
		RestAssured.baseURI=url;
		given().queryParam("name","balu").queryParam("key","713e187abb4cf6d32013ce3022fc6df3")
		.queryParam("token","f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225")
		.contentType(ContentType.JSON).accept(ContentType.JSON).post("/1/boards/").then().log().all();
	}
	//update the board
	@Test(enabled=false)
	public void tc2() {
		JSONObject js=new JSONObject();
		RestAssured.baseURI=url;
		given().queryParam("name","uday").queryParam("key","713e187abb4cf6d32013ce3022fc6df3")
		.queryParam("token","f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225")
		.contentType(ContentType.JSON).accept(ContentType.JSON).put("/1/boards/zoU088lN").then().log().all();
		
		
	}
	//Delete a board
	@Test(enabled=true)
	public void tc3() {
		RestAssured.baseURI=url;
		given().queryParam("name","balu").queryParam("key","713e187abb4cf6d32013ce3022fc6df3")
		.queryParam("token","f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225")
		.when()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.delete("/1/boards/1EkVzzRl").then().log().all();
		
	}
	//Get a Board
	@Test(enabled=false)
	public void get_tc4() {
		RestAssured.baseURI=url;
		given().queryParam("name","uday").queryParam("key","0ca1731bdb933b53695b7ccaea733e71")
		.queryParam("token","f84e29b1eb9adc925b24fd0f05fb93f9192ba395b2262b67065d26d70457f225")
		.when()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.put("/1/boards/zoU088lN").then().log().all();
		
	}
	//Get all boards
	@Test(enabled=false)
	public void tc5() {
		RestAssured.baseURI=url;
		given().queryParam("name","uday").queryParam("key","713e187abb4cf6d32013ce3022fc6df3")
		.queryParam("token","f5afb2fadce5da79d715b1eb1ce546ee5d7f637d3d75cb7d17f84d74c6f5e08f")
		.when()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.put("/1/boards/zoU088lN").then().log().all();
		
	}

}
