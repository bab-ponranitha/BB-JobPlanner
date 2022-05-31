package com.jobplanner.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "QUOTATION")
public class Quotation extends Auditable implements Serializable {
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
	@JoinColumn(name = "maintenance_record_id", nullable = false)
	private MaintenanceRecord maintenanceRecord;
	
	private String name;
	private String notes;
	@ManyToOne
	@JoinColumn(name = "status", nullable = false)
	private RefQuotationStatus refQuotationStatus;
	
	@ManyToOne
	@JoinColumn(name = "contact", nullable = false)
	private User user;
	
	private int subTotal;
	private int discountPercent;
	private int cost;
	private int gstPercent;
	private int total;
	private Boolean active;
	public Quotation() {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public RefQuotationStatus getRefQuotationStatus() {
		return refQuotationStatus;
	}
	public void setRefQuotationStatus(RefQuotationStatus refQuotationStatus) {
		this.refQuotationStatus = refQuotationStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getGstPercent() {
		return gstPercent;
	}
	public void setGstPercent(int gstPercent) {
		this.gstPercent = gstPercent;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
