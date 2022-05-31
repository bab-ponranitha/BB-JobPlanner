package com.jobplanner.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "JOB")
public class Job extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client Client;
	
	private String description;
	private String siteAddress;
	private String siteSuburb;
	private String siteState;
	private String siteCountry;
	private String sitePostalCode;
	
	@ManyToOne
	@JoinColumn(name = "status")
	private RefJobStatus refJobStatus;
	
	private String contact;
	private Date dueDate;
	private Boolean active;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<JobSpecification> jobSpecification;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<JobStatusHistory> jobStatusHistory;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<MaintenanceRecord> maintenanceRecord;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<Quotation> quotation;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<RawMaterial> rawMaterial;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<PurchaseOrder> purchaseOrder;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<Production> production;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<Delivery> delivery;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<Installation> installation;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<InstallationOrder> installationOrder;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private List<Qa> qa;
	

	public Job() {	
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

	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public RefJobStatus getRefJobStatus() {
		return refJobStatus;
	}

	public void setRefJobStatus(RefJobStatus refJobStatus) {
		this.refJobStatus = refJobStatus;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<JobStatusHistory> getJobStatusHistory() {
		return jobStatusHistory;
	}

	public void setJobStatusHistory(List<JobStatusHistory> jobStatusHistory) {
		this.jobStatusHistory = jobStatusHistory;
	}

	public List<MaintenanceRecord> getMaintenanceRecord() {
		return maintenanceRecord;
	}

	public void setMaintenanceRecord(List<MaintenanceRecord> maintenanceRecord) {
		this.maintenanceRecord = maintenanceRecord;
	}

	public List<Quotation> getQuotation() {
		return quotation;
	}

	public void setQuotation(List<Quotation> quotation) {
		this.quotation = quotation;
	}

	public List<RawMaterial> getRawMaterial() {
		return rawMaterial;
	}

	public void setRawMaterial(List<RawMaterial> rawMaterial) {
		this.rawMaterial = rawMaterial;
	}

	public List<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(List<PurchaseOrder> purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public List<Production> getProduction() {
		return production;
	}

	public void setProduction(List<Production> production) {
		this.production = production;
	}
	
}
