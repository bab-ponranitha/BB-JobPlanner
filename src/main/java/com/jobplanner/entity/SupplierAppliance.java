/**
 * 
 */
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
@Table(name = "SUPPLIER_APPLIANCE")
public class SupplierAppliance extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "appliance_id", nullable = false)
	private Appliance appliance;
	
	private int minimumOrderQty;
	private Boolean active;

	public SupplierAppliance() {
	}

	public SupplierAppliance(int id, Supplier supplier, Appliance appliance, int minimumOrderQty, Boolean active) {
		this.id = id;
		this.supplier = supplier;
		this.appliance = appliance;
		this.minimumOrderQty = minimumOrderQty;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Appliance getAppliance() {
		return appliance;
	}

	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}

	public int getMinimumOrderQty() {
		return minimumOrderQty;
	}

	public void setMinimumOrderQty(int minimumOrderQty) {
		this.minimumOrderQty = minimumOrderQty;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
