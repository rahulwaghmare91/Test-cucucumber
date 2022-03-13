package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetIssueValues {
String id;
String description;
String name;
String subtask;
String self;
public String getSelf() {
	return self;
}
public void setSelf(String self) {
	this.self = self;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubtask() {
	return subtask;
}
public void setSubtask(String subtask) {
	this.subtask = subtask;
}

}
