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
@Table(name = "HARDWARE_CATEGORY")
public class HardwareCategory extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "hardware_id", nullable = false)
	private Hardware hardware;
	
	@ManyToOne
	@JoinColumn(name = "product_category_id", nullable = false)
	private RefProductCategory refProductCategory;
	
	private Boolean active;
	public HardwareCategory() {
	}
	public HardwareCategory(int id, Hardware hardware, RefProductCategory refProductCategory, Boolean active) {
		this.id = id;
		this.hardware = hardware;
		this.refProductCategory = refProductCategory;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Hardware getHardware() {
		return hardware;
	}
	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}
	public RefProductCategory getRefProductCategory() {
		return refProductCategory;
	}
	public void setRefProductCategory(RefProductCategory refProductCategory) {
		this.refProductCategory = refProductCategory;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
