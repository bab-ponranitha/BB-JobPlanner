package com.jobplanner.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "RAW_MATERIAL")
public class RawMaterial extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6165954815593297988L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "job_id", nullable = false,insertable = false,updatable = false)
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "maintenance_record_id", nullable = false,insertable = false,updatable = false)
	private MaintenanceRecord maintenanceRecord;
	
	@ManyToOne
	@JoinColumn(name = "hardware_id", nullable = false,insertable = false,updatable = false)
	private Hardware hardware;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false,insertable = false,updatable = false)
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "status", nullable = false,insertable = false,updatable = false)
	private RefStoreStatus refStoreStatus;
	
	@ManyToOne
	@JoinColumn(name = "requestor", nullable = false,insertable = false,updatable = false)
	private User requestor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dueDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date assignedOn;
	
	@ManyToOne
	@JoinColumn(name = "store_contact", nullable = false,insertable = false,updatable = false)
	private User storeContact;
	
	private String notes;
	private Boolean active;

	public RawMaterial() {
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

	public MaintenanceRecord getMaintenanceRecord() {
		return maintenanceRecord;
	}

	public void setMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
		this.maintenanceRecord = maintenanceRecord;
	}

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public RefStoreStatus getRefStoreStatus() {
		return refStoreStatus;
	}

	public void setRefStoreStatus(RefStoreStatus refStoreStatus) {
		this.refStoreStatus = refStoreStatus;
	}

	public User getRequestor() {
		return requestor;
	}

	public void setRequestor(User requestor) {
		this.requestor = requestor;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getAssignedOn() {
		return assignedOn;
	}

	public void setAssignedOn(Date assignedOn) {
		this.assignedOn = assignedOn;
	}

	public User getStoreContact() {
		return storeContact;
	}

	public void setStoreContact(User storeContact) {
		this.storeContact = storeContact;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
