package rest_testing;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class jsonobjecttest {
	public String url="https://reqres.in/api/users?page=2";
	@Test(enabled=true)
	public void get_tc1() {
		Response rep=RestAssured.get(url);
		int actual=rep.statusCode();
		Assert.assertEquals(actual, 200);
		
	}
	@Test(enabled=true)
	public void get_tc2() {
		
	given().get(url).then().statusCode(200).body("data.id[2]", equalTo(9)).log().all();
	}
	@Test(enabled=true)
	public void post_tc3() {
		JSONObject js=new JSONObject();
		js.put("name", "sathvik");
		js.put("job","team leader");
		Response resp=given().contentType(ContentType.JSON).log().all().body(js).post("https://reqres.in/api/users/2");
		resp.prettyPrint();

	}
	//for register succesfull
	@Test(enabled=true)
	public void tc_4() {
		JSONObject js= new JSONObject();
		js.put("email", "eve.holt@reqres.in");
	    js.put("password", "cityslicka");

		//given().body(js.toJSONString()).when().post("https://reqres.in/api/register").then().statusCode(200).log().all();
		
		
	}

		

}
