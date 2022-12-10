package rest_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class assretvalidation {
	
	public String url="https://reqres.in/api/users?page=2";
	@Test(enabled=true)
	public void get_tc1() {
		Response rep=RestAssured.get(url);
		int actual=rep.statusCode();
		Assert.assertEquals(actual, 200);//checking the status code

}
}