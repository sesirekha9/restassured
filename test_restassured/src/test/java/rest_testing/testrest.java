package rest_testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testrest {
	public String url="https://reqres.in/api/users?page=2";
	@Test
	public void get_test1() {
		Response rep=RestAssured.get(url);
		System.out.println(rep.statusCode());
		System.out.println(rep.body());
		System.out.println(rep.asString());
		
		
		
		
		
	}

}
