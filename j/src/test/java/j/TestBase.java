package j;

import io.restassured.path.json.JsonPath;

public class TestBase {
public static String getBody() {
	{
		String body="{\r\n"
		+ "  \"fields\":{\r\n"
		+ "  \"project\": \r\n"
		+ "    {\r\n"
		+ "    \r\n"
		+ "      \"key\": \"AP\"\r\n"
		+ "    },\r\n"
		+ "    \"summary\":\"this is bug through automation\",\r\n"
		+ "    \r\n"
		+ "    \"issuetype\":{\r\n"
		+ "    \"name\":\"Bug\"\r\n"
		+ "    }\r\n"
		+ "  }\r\n"
		+ "    \r\n"
		+ "  \r\n"
		+ "}" ;
		return body;
	}
	}
public static  JsonPath parseBody(String  responseBody) {
	JsonPath json =new JsonPath(responseBody);
	return json;
}
public static String addCommentPostBody() {
	String postBody="{\r\n"
	+ "    \"body\": \"adding   new  comment.\",\r\n"
	+ "    \"visibility\": {\r\n"
	+ "        \"type\": \"role\",\r\n"
	+ "        \"value\": \"Administrator\"\r\n"
	+ "    }\r\n"
	+ "}";
	return postBody;
}

}



