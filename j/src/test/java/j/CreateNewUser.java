package j;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class CreateNewUser {
	public HashMap map=new HashMap();
@BeforeClass
public void postData() {
	map.put("name", "rttts");
	map.put("job", "devops");
	RestAssured.baseURI="https://reqres.in/api";
	RestAssured.basePath="/users";
}
@Test
public void createUser() {
	given()
	.contentType("application/json")
	.body(map).
	when()
	.post()
	.then()
	.statusCode(201);
}
}