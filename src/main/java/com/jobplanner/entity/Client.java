package com.jobplanner.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "client_type_id", nullable = false)
	private RefClientType refClientType;
	
	@ManyToOne
	@JoinColumn(name = "builder_id")
	private Builder builder;
	
	private String name;
	private String surname;
	private String email;
	private String mobile;
	private String workPhone;
	private String address;
	private String suburb;
	private String state;
	private String country;
	private String postalCode;
	private String source;
	private String siteAddress;
	private String siteSuburb;
	private String siteState;
	private String siteCountry;
	private String sitePostalCode;
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="client_id")
	private List<Job> job;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="stone_benchtop_supplier")
	private List<JobSpecification> jobSpecification;
	
	public Client() {
	}

	public Client(int id, RefClientType refClientType, Builder builder, String name, String surname, String email,
			String mobile, String workPhone, String address, String suburb, String state, String country,
			String postalCode, String source, String siteAddress, String siteSuburb, String siteState,
			String siteCountry, String sitePostalCode, Boolean active) {
		this.id = id;
		this.refClientType = refClientType;
		this.builder = builder;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
		this.workPhone = workPhone;
		this.address = address;
		this.suburb = suburb;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.source = source;
		this.siteAddress = siteAddress;
		this.siteSuburb = siteSuburb;
		this.siteState = siteState;
		this.siteCountry = siteCountry;
		this.sitePostalCode = sitePostalCode;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RefClientType getRefClientType() {
		return refClientType;
	}

	public void setRefClientType(RefClientType refClientType) {
		this.refClientType = refClientType;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSiteAddress() {
		return siteAddress;
	}

	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

	public String getSiteSuburb() {
		return siteSuburb;
	}

	public void setSiteSuburb(String siteSuburb) {
		this.siteSuburb = siteSuburb;
	}

	public String getSiteState() {
		return siteState;
	}

	public void setSiteState(String siteState) {
		this.siteState = siteState;
	}

	public String getSiteCountry() {
		return siteCountry;
	}

	public void setSiteCountry(String siteCountry) {
		this.siteCountry = siteCountry;
	}

	public String getSitePostalCode() {
		return sitePostalCode;
	}

	public void setSitePostalCode(String sitePostalCode) {
		this.sitePostalCode = sitePostalCode;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
