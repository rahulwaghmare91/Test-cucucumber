package com.example;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Aggregateprogress {

@SerializedName("progress")
@Expose
private Integer progress;
@SerializedName("total")
@Expose
private Integer total;

public Integer getProgress() {
return progress;
}

public void setProgress(Integer progress) {
this.progress = progress;
}

public Integer getTotal() {
return total;
}

public void setTotal(Integer total) {
this.total = total;
}
}