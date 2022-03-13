package j;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.pojo.CommentPojo;
import com.pojo.GetIssue;

import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;

public class GetSingleComment {
	@Test
	public void getSingleComment() {
	 String  username="r8494414@gmail.com";
	 String password="DsiCqJkLt4SLWoEpUiB7F3EA";
	 RequestSpecification req=  given().auth().preemptive().basic(username, password);
	 CommentPojo c= req.expect().defaultParser(Parser.JSON).when().get("https://lostlove.atlassian.net/rest/api/2/issue/AP-14/comment/10007").as(com.pojo.CommentPojo.class);
	 String body= c.getBody();
	 System.out.println(c.getAuthor().getEmailAddress());
	 System.out.println(c.getAuthor().getAvtarurls().getS());
	 
	 
}
}	
