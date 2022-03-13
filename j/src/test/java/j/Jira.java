package j;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class Jira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this will create a bug
		 String username = "rw6476456@gmail.com";
	        String password = "cH7DkihlD8dY6bRzIsSt68F7";

	        //language=JSON
	        String jsonBody = "{\r\n"
	        		+ "  \"fields\":{\r\n"
	        		+ "  \"project\": \r\n"
	        		+ "    {\r\n"
	        		+ "    \r\n"
	        		+ "      \"key\": \"PR\"\r\n"
	        		+ "    },\r\n"
	        		+ "    \"summary\":\"bug created through rest assured\",\r\n"
	        		+ "    \r\n"
	        		+ "    \"issuetype\":{\r\n"
	        		+ "    \"name\":\"Bug\"\r\n"
	        		+ "    }\r\n"
	        		+ "  }\r\n"
	        		+ "    \r\n"
	        		+ "  \r\n"
	        		+ "}";

	      Response response=  given().auth().preemptive().basic(username, password)
	                .body(jsonBody)
	                .contentType(ContentType.JSON)
	                .when()
	                .post("https://rwaghmare.atlassian.net/rest/api/3/issue");
	      System.out.println(response.statusCode());
	      String body=response.getBody().asString();
	      JsonPath j1=new JsonPath(body);
	      String generatedId=j1.get("id");
	      System.out.println(generatedId);
	      /*
	       * below code for get issue using id
	       */
	     Response r2= given().auth().preemptive().basic(username, password).when().get("https://rwaghmare.atlassian.net//rest/api/3/issue/"+generatedId+"");
	      System.out.println(r2.statusCode());
	      String getBody=response.getBody().asString();
	      JsonPath j2=new JsonPath(getBody);
	      String generatedId1=j1.get("id");
	      System.out.println(generatedId1);
	      /*
	       * Below code is used to delet issue
	       */
	      Response r3= given().auth().preemptive().basic(username, password).when().delete("https://rwaghmare.atlassian.net/rest/api/3/issue/"+generatedId+"");
	      System.out.println(r3.statusCode());
	     
	      
	               
	}

}
