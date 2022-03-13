package j;

import static io.restassured.RestAssured.given;

import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue {
	private String  username="r8494414@gmail.com";
	private String password="DsiCqJkLt4SLWoEpUiB7F3EA";
	public String issueID;
	public String issueKey;
	public String commentID;
public RequestSpecification aunticate() {
    RequestSpecification req=  given().auth().preemptive().basic(username, password);
return req;
}
@Test(priority=1)
public void createIssue() {
	
Response response=	aunticate().body(TestBase.getBody()).contentType(ContentType.JSON).when().post("https://lostlove.atlassian.net/rest/api/2/issue");
int postStatuscode=response.statusCode();
System.out.println(postStatuscode);
Assert.assertEquals(postStatuscode,201);
String body=response.getBody().asString();
issueID=TestBase.parseBody(body).getString("id");
issueKey=TestBase.parseBody(body).getString("key");

}
@Test(priority=2)
public void getIssueByKey() {
	Response getresponse=	aunticate().when().get("https://lostlove.atlassian.net/rest/api/2/issue/"+issueKey+"");
	getresponse.then().statusCode(200);
	String getResponseBody=getresponse.getBody().asString();
	String getIssueKey=TestBase.parseBody(getResponseBody).getString("key");
	Assert.assertEquals(issueKey, getIssueKey);
	System.out.println(issueKey);
	
}
@Test(priority=3)
public void addCommentToIssue() {
	Response commentResponseBody=	aunticate().body(TestBase.addCommentPostBody()).contentType(ContentType.JSON).when().post("https://lostlove.atlassian.net/rest/api/2/issue/"+issueKey+"/comment");
	System.out.println(commentResponseBody);
	commentResponseBody.then().statusCode(201);
	commentID=TestBase.parseBody(commentResponseBody.asString()).get("id");

}
@Test(priority=4)
public void getCommentBYKey() {
	Response getcommentResponseBody=aunticate().when().get("https://lostlove.atlassian.net/rest/api/2/issue/"+issueKey+"/comment/"+commentID+"");
	getcommentResponseBody.then().statusCode(200);
	String getcommentID=TestBase.parseBody(getcommentResponseBody.asString()).get("id");
	Assert.assertEquals(getcommentID,getcommentID);
	
}
@Test(enabled=false)
public void deletCommentOFIssue() {
	Response getdeletResponseBody=aunticate().when().delete("https://lostlove.atlassian.net/rest/api/2/issue/"+issueKey+"/comment/"+commentID+"");
	getdeletResponseBody.then().statusCode(204);
}
}
