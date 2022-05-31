package com.jobplanner.dto;

import java.io.Serializable;

public class UserRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String address;
	private int mobile;
	private String suburb;
	private String state;
	private int postalCode;
	private String communicationEmailId;
	private String communicationEmailPassword;
	private Boolean active;
	
	public UserRequest() {
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public int getMobile() {
		return mobile;
	}
	public String getSuburb() {
		return suburb;
	}
	public String getState() {
		return state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public String getCommunicationEmailId() {
		return communicationEmailId;
	}
	public String getCommunicationEmailPassword() {
		return communicationEmailPassword;
	}
	public Boolean getActive() {
		return active;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public void setCommunicationEmailId(String communicationEmailId) {
		this.communicationEmailId = communicationEmailId;
	}
	public void setCommunicationEmailPassword(String communicationEmailPassword) {
		this.communicationEmailPassword = communicationEmailPassword;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
