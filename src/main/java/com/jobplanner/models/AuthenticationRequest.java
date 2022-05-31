package com.jobplanner.models;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7553194099406191532L;
	private String userName;
	private String password;

	public AuthenticationRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public AuthenticationRequest() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
