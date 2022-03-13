package com.pojo;

import java.util.List;

import com.example.Fields;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetIssue {
	String id;
	String key;
	String expand;
	private Fields fields;

	

public Fields getFields() {
		return fields;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}
public String getExpand() {
	return expand;
}
public void setExpand(String expand) {
	this.expand = expand;
}
/**
 * @return
 */
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
;


}