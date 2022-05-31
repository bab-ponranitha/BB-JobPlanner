package com.jobplanner.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "REF_APPLIANCE_TYPE")
public class RefApplianceType extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Boolean active;
	
	@OneToMany
	@JoinColumn(name = "appliance_type_id",nullable=false)
	private List<Appliance> appliance;
	public RefApplianceType() {
	}

	public RefApplianceType(int id, String name, Boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<Appliance> getAppliance() {
		return appliance;
	}

	public void setAppliance(List<Appliance> appliance) {
		this.appliance = appliance;
	}
}
