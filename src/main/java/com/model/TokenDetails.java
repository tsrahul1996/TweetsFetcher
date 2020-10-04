package com.model;

public class TokenDetails {

    private String token_type;
    private String access_token;
    

	public TokenDetails() {
		super();
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getAccessToken() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public TokenDetails(String token_type, String access_token) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
	}


}
