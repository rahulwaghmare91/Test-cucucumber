package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectType {
String id;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
}
