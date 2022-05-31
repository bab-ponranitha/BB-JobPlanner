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
@Table(name = "JOB_STATUS_HISTORY")
public class JobStatusHistory extends Auditable implements Serializable {
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
	@JoinColumn(name = "status", nullable = false)
	private RefJobStatus refJobStatus;
	
	private Boolean active;

	public JobStatusHistory() {
	}

	public JobStatusHistory(int id, Job job, RefJobStatus refJobStatus, Boolean active) {
		this.id = id;
		this.job = job;
		this.refJobStatus = refJobStatus;
		this.active = active;
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

	public RefJobStatus getRefJobStatus() {
		return refJobStatus;
	}

	public void setRefJobStatus(RefJobStatus refJobStatus) {
		this.refJobStatus = refJobStatus;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
