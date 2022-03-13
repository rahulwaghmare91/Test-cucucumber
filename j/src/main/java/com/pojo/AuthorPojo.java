package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorPojo {
String accountId;
AvtarUrl avtarurls;
public AvtarUrl getAvtarurls() {
	return avtarurls;
}
public void setAvtarurls(AvtarUrl avtarurls) {
	this.avtarurls = avtarurls;
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
String emailAddress;
}
