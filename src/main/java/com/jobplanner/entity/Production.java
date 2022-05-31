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

@Entity
@Table(name = "PRODUCTION")
public class Production extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "maintenance_record_id")
	private MaintenanceRecord maintenanceRecord;
	
	@ManyToOne
	@JoinColumn(name = "ref_production_work_id")
	private RefProductionWork refProductionWork;
	
	@ManyToOne
	@JoinColumn(name = "ref_production_work_status_id")
	private RefProductionWorkStatus refProductionWorkStatus;
	
	private Date loggedOn;
	
	@ManyToOne
	@JoinColumn(name = "logged_by")
	private User loggedBy;
	
	private String comments;
	private Boolean active;

	public Production() {
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

	public RefProductionWork getRefProductionWork() {
		return refProductionWork;
	}

	public void setRefProductionWork(RefProductionWork refProductionWork) {
		this.refProductionWork = refProductionWork;
	}

	public RefProductionWorkStatus getRefProductionWorkStatus() {
		return refProductionWorkStatus;
	}

	public void setRefProductionWorkStatus(RefProductionWorkStatus refProductionWorkStatus) {
		this.refProductionWorkStatus = refProductionWorkStatus;
	}

	public Date getLoggedOn() {
		return loggedOn;
	}

	public void setLoggedOn(Date loggedOn) {
		this.loggedOn = loggedOn;
	}

	public User getLoggedBy() {
		return loggedBy;
	}

	public void setLoggedBy(User loggedBy) {
		this.loggedBy = loggedBy;
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
}
