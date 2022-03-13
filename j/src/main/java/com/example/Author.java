package com.example;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Author {

@SerializedName("self")
@Expose
private String self;
@SerializedName("accountId")
@Expose
private String accountId;
@SerializedName("emailAddress")
@Expose
private String emailAddress;
@SerializedName("avatarUrls")
@Expose
private AvatarUrls__3 avatarUrls;
@SerializedName("displayName")
@Expose
private String displayName;
@SerializedName("active")
@Expose
private Boolean active;
@SerializedName("timeZone")
@Expose
private String timeZone;
@SerializedName("accountType")
@Expose
private String accountType;

public String getSelf() {
return self;
}

public void setSelf(String self) {
this.self = self;
}

public String getAccountId() {
return accountId;
}

public void setAccountId(String accountId) {
this.accountId = accountId;
}

public String getEmailAddress() {
return emailAddress;
}

public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
}

public AvatarUrls__3 getAvatarUrls() {
return avatarUrls;
}

public void setAvatarUrls(AvatarUrls__3 avatarUrls) {
this.avatarUrls = avatarUrls;
}

public String getDisplayName() {
return displayName;
}

public void setDisplayName(String displayName) {
this.displayName = displayName;
}

public Boolean getActive() {
return active;
}

public void setActive(Boolean active) {
this.active = active;
}

public String getTimeZone() {
return timeZone;
}

public void setTimeZone(String timeZone) {
this.timeZone = timeZone;
}

public String getAccountType() {
return accountType;
}

public void setAccountType(String accountType) {
this.accountType = accountType;
}

}
