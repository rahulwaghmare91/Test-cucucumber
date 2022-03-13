package j;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;
public class PracticeRestAssured {
@Test
public void getUsersDetail() {
	System.out.println("hi");
	System.out.println();
RestAssured.baseURI="https://reqres.in/api";
RequestSpecification request=RestAssured.given();
Response response=request.request(Method.GET,"/users?page=2");
int usersCode=response.statusCode();
assertEquals(usersCode, 200);
String responsebody=response.getBody().asString();
System.out.println("response body is "+responsebody);
String statusLine=response.getStatusLine();
assertEquals(statusLine,"HTTP/1.1 200 OK");

}
@Test
void createUser() {
	System.out.println("hi");
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
@Test
void updateuser(){
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification request=RestAssured.given();
	JSONObject reqParam=new JSONObject();
	reqParam.put("name","u");
	reqParam.put("job","worker");
	request.header("Content-Type","application/json");
	request.body(reqParam.toJSONString());
	Response response=request.request(Method.PUT,"/api/users/8");
	System.out.println(response.getStatusCode());
	System.out.println(response.getBody().asString());
	given().
	when().
	get("https://reqres.in").
	then();

	
}
}
