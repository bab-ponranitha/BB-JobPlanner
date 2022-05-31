package com.jobplanner.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class User extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "logged_by", nullable = false, insertable = false, updatable = false)
	private List<Installation> installation;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "logged_by", nullable = false, insertable = false, updatable = false)
	private List<Delivery> delivery;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	private List<UserRole> userRole;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "raised_by", nullable = false, insertable = false, updatable = false)
	private List<MaintenanceRecord> maintenanceRecord;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact", nullable = false, insertable = false, updatable = false)
	private List<Quotation> quotaion;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "requestor", nullable = false)
	private List<RawMaterial> requestorRawMaterial;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_contact", nullable = false)
	private List<RawMaterial> rawMaterial;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "requestor")
	private List<PurchaseOrder> purchaseOrder;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "logged_by")
	private List<Production> production;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="installer_confirmed_by")
	private List<InstallationOrder> confirmedInstallionOrder;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "logged_by", nullable = false, insertable = false, updatable = false)
	private List<Qa> qa;

	public User() {
		super();
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
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

	public List<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}

}
