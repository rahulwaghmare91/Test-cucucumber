package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentPojo {
String Self;
String id;
AuthorPojo author;
String body;
public String getSelf() {
	return Self;
}
public void setSelf(String self) {
	Self = self;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public AuthorPojo getAuthor() {
	return author;
}
public void setAuthor(AuthorPojo author) {
	this.author = author;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}

}

