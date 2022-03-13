package j;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.Test;

import com.example.Author;
import com.example.Example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pojo.First;
import com.pojo.GetIssue;
import com.pojo.GetIssueValues;

import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
public class GetUsers {
@Test
public void getUsersDetail() {
	 String  username="r8494414@gmail.com";
	 String password="DsiCqJkLt4SLWoEpUiB7F3EA";
	 RequestSpecification req=  given().auth().preemptive().basic(username, password);
	 GetIssue u= req.expect().defaultParser(Parser.JSON).when().get("https://lostlove.atlassian.net/rest/api/2/issue/AP-14").as(com.pojo.GetIssue.class);
	System.out.println(u.getFields().getIssuetype().getId());

		





}
}
