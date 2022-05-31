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
@Table(name = "JOB_SPECIFICATION_HARDWARE")
public class JobSpecificationHardware extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "job_spec_id")
	private JobSpecification jobSpecification;
	
	@ManyToOne
	@JoinColumn(name = "hardware_id")
	private Hardware hardware;
	
	private int quantity;
	private Boolean active;

	public JobSpecificationHardware() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobSpecification getJobSpecification() {
		return jobSpecification;
	}

	public void setJobSpecification(JobSpecification jobSpecification) {
		this.jobSpecification = jobSpecification;
	}

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
