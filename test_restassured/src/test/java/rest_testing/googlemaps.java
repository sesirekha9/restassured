package rest_testing;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class googlemaps {
public static String Addurl="http://216.10.245.166";
	
	public static String delurl="http://216.10.245.166";
	@Test
	public void add()
	{
		
	JSONObject js=new JSONObject();
		
	js.put("lat", 38.383494);
	js.put("lng", 38.383494);
	js.put("accuracy", 50);
	js.put("name", "Frontline house");
	js.put("phone_number", "983 893 3937");
	js.put("address", "29, side layout, cohen 09");
	js.put("types", "shoe park");
	js.put("website", "http://google.com");
	js.put("language", "French-IN");
	Response resp=given().queryParam("Key","qaclick123").contentType(ContentType.JSON)
			.log().all().body(js).when().post("http://216.10.245.166/maps/api/place/add/json/");
		resp.prettyPrint();
		
		
	}
	@Test
	public void delete() {
		JSONObject js=new JSONObject();
		js.put("delete","8be79d9f383974c92c0bc46e5bb45a37");
		Response resp=given().queryParam("Key","qaclick123").contentType(ContentType.JSON)
				.log().all().body(js).when().post("http://216.10.245.166/maps/api/place/add/json/");
		System.out.println("user deleted successfully");
		
	}
	
	
	
	
	
}

