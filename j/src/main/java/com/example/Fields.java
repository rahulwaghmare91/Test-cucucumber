package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"statuscategorychangedate",
"issuetype"})
@Generated("jsonschema2pojo")
public class Fields {

@JsonProperty("statuscategorychangedate")
private String statuscategorychangedate;
@JsonProperty("issuetype")
private Issuetype issuetype;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("statuscategorychangedate")
public String getStatuscategorychangedate() {
return statuscategorychangedate;
}

@JsonProperty("statuscategorychangedate")
public void setStatuscategorychangedate(String statuscategorychangedate) {
this.statuscategorychangedate = statuscategorychangedate;
}

@JsonProperty("issuetype")
public Issuetype getIssuetype() {
return issuetype;
}

@JsonProperty("issuetype")
public void setIssuetype(Issuetype issuetype) {
this.issuetype = issuetype;
}
}