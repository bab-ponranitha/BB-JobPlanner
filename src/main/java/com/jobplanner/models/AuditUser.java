package com.jobplanner.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AuditUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String email;
	@JsonIgnore
	private String password;
	private List<String> roleScope;
	private Boolean active;
	
	public AuditUser() {
	}

	public AuditUser(int id, String username, String email, String password,Boolean active) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.active=active;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getRoleScope() {
		return roleScope;
	}

	public void setRoleScope(List<String> roleScope) {
		this.roleScope = roleScope;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
