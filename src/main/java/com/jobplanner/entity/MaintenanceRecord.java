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
@Table(name = "MAINTENANCE_RECORD")
public class MaintenanceRecord extends Auditable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "job_id", nullable = false)
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "source_module", nullable = false)
	private RefMaintenanceRecordSource refMaintenanceRecordSource;	
	
	private String description;
	@ManyToOne
	@JoinColumn(name = "raised_by", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "status", nullable = false)
	private RefMaintenanceStatus refMaintenanceStatus;
	
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<Quotation> quotation;	
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<RawMaterial> rawMaterial;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<PurchaseOrder> purchaseOrder;	
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<Production> production;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<Installation> installation;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<InstallationOrder> installationOrder;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<Delivery> delivery;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "maintenance_record_id")
	private List<Qa> qa;
	
	public MaintenanceRecord() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public RefMaintenanceRecordSource getRefMaintenanceRecordSource() {
		return refMaintenanceRecordSource;
	}

	public void setRefMaintenanceRecordSource(RefMaintenanceRecordSource refMaintenanceRecordSource) {
		this.refMaintenanceRecordSource = refMaintenanceRecordSource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RefMaintenanceStatus getRefMaintenanceStatus() {
		return refMaintenanceStatus;
	}

	public void setRefMaintenanceStatus(RefMaintenanceStatus refMaintenanceStatus) {
		this.refMaintenanceStatus = refMaintenanceStatus;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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
