package com.jobplanner.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3346026470105140876L;
	private final String jwt;

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
}
