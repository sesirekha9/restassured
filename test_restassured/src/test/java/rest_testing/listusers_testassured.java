package rest_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;



public class listusers_testassured {
	public String url="https://reqres.in/api/users?page=2";
	@Test(enabled=false)
	public void get_tc1() {
		Response rep=RestAssured.get(url);
		int actual=rep.statusCode();
		Assert.assertEquals(actual, 200);
		
	}
	@Test(enabled=true)
	public void get_tc2() {
		//given().get(url).then().statusCode(200).log().all();
		//given().get(url).then().statusCode(200).body("data.first_name", hasItems("Michael"));
		given().get(url).then().statusCode(200).body("data.id[2]", equalTo(9)).log().all();
			
		
	}

}
