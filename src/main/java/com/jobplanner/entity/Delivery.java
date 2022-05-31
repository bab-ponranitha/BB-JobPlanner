package com.jobplanner.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DELIVERY")
public class Delivery extends Auditable implements Serializable {
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
	
	@ManyToOne
	@JoinColumn(name = "logged_by", nullable = false)
	private User loggerBy;
	
	private String comments;
	private Boolean active;
	
	@OneToMany
	@JoinColumn(name = "delivery_checklist_id")
	private List<DeliveryDetails> deliveryDetails;

	public Delivery() {
	}

	public Delivery(int id, Job job, MaintenanceRecord maintenanceRecord, User loggerBy, String comments,
			Boolean active, List<DeliveryDetails> deliveryDetails) {
		this.id = id;
		this.job = job;
		this.maintenanceRecord = maintenanceRecord;
		this.loggerBy = loggerBy;
		this.comments = comments;
		this.active = active;
		this.deliveryDetails = deliveryDetails;
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

	public User getLoggerBy() {
		return loggerBy;
	}

	public void setLoggerBy(User loggerBy) {
		this.loggerBy = loggerBy;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<DeliveryDetails> getDeliveryDetails() {
		return deliveryDetails;
	}

	public void setDeliveryDetails(List<DeliveryDetails> deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

}
