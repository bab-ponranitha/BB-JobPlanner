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
@Table(name = "SUPPLIER")
public class Supplier extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String suburb;
	private String state;
	private String country;
	private String postalCode;
	private String abn;
	private String comment;
	private String billingAddress;
	private String billingSuburb;
	private String billingState;
	private String billingCountry;
	private String billingPostalCode;
	private String homePhone;
	private String workPhone;
	private String mobile;
	private String preferredContactMethod;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private List<SupplierHardware> supplierHardware;

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private List<SupplierAppliance> supplierAppliance;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private List<RawMaterial> rawMaterial;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private List<PurchaseOrder> purchaseOrder;

	public Supplier(int id, String name, String address, String suburb, String state, String country, String postalCode,
			String abn, String comment, String billingAddress, String billingSuburb, String billingState,
			String billingCountry, String billingPostalCode, String homePhone, String workPhone, String mobile,
			String preferredContactMethod) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.suburb = suburb;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.abn = abn;
		this.comment = comment;
		this.billingAddress = billingAddress;
		this.billingSuburb = billingSuburb;
		this.billingState = billingState;
		this.billingCountry = billingCountry;
		this.billingPostalCode = billingPostalCode;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.mobile = mobile;
		this.preferredContactMethod = preferredContactMethod;
	}

	public Supplier() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) {
		this.abn = abn;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingSuburb() {
		return billingSuburb;
	}

	public void setBillingSuburb(String billingSuburb) {
		this.billingSuburb = billingSuburb;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public String getBillingPostalCode() {
		return billingPostalCode;
	}

	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPreferredContactMethod() {
		return preferredContactMethod;
	}

	public void setPreferredContactMethod(String preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}
}