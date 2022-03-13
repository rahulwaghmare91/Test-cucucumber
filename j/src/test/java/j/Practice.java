package j;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practice {
	@SuppressWarnings("unchecked")
	@Test
	void createUser() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request=RestAssured.given();
		JSONObject reqParam=new JSONObject();
		reqParam.put("name","system");
		reqParam.put("job","helper");
		request.header("Content-Type","application/json");
		request.body(reqParam.toJSONString());
		Response response=request.request(Method.POST,"/api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());

		
		
		}
}
