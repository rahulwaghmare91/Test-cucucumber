package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class First {
String statuscategorychangedate;
GetIssue issue;

public GetIssue getIssue() {
	return issue;
}

public void setIssue(GetIssue issue) {
	this.issue = issue;
}

public String getStatuscategorychangedate() {
	return statuscategorychangedate;
}

public void setStatuscategorychangedate(String statuscategorychangedate) {
	this.statuscategorychangedate = statuscategorychangedate;
}

}