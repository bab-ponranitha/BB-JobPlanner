package com.jobplanner.entity;

import java.io.Serializable;
import java.util.Set;

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
@Table(name = "APPLIANCE")
public class Appliance extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6513026131694101336L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String code;
	private String brand;
	private String type;
	private String modelNumber;
	private double length;
	private double width;
	private double thickness;
	private String rateTypeName;
	private double purchasePrice;
	private double sellPrice;
	private Boolean active;
	@ManyToOne
	@JoinColumn(name = "appliance_type_id", nullable = false,insertable=false,updatable=false)
	private RefApplianceType refApplianceType;
	@OneToMany
	@JoinColumn(name="appliance_id")
	private Set<SupplierAppliance> supplierAppliance;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "appliances_id")
	private Set<JobSpecificationHardware> JobSpecificationHardware; 
	
	public RefApplianceType getRefApplianceType() {
		return refApplianceType;
	}

	public void setRefApplianceType(RefApplianceType refApplianceType) {
		this.refApplianceType = refApplianceType;
	}

	public Set<SupplierAppliance> getSupplierAppliance() {
		return supplierAppliance;
	}

	public void setSupplierAppliance(Set<SupplierAppliance> supplierAppliance) {
		this.supplierAppliance = supplierAppliance;
	}

	public RefApplianceType getApplianceType() {
		return refApplianceType;
	}

	public void setApplianceType(RefApplianceType refApplianceType) {
		this.refApplianceType = refApplianceType;
	}

	public Appliance() {
	}

	public Appliance(int id, String name, String code, String brand, String type, String modelNumber, double length,
			double width, double thickness, String rateTypeName, double purchasePrice, double sellPrice,
			Boolean active) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.brand = brand;
		this.type = type;
		this.modelNumber = modelNumber;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.rateTypeName = rateTypeName;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getThickness() {
		return thickness;
	}

	public String getRateTypeName() {
		return rateTypeName;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public double getSellPrice() {
		return sellPrice;
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

	public void setCode(String code) {
		this.code = code;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public void setRateTypeName(String rateTypeName) {
		this.rateTypeName = rateTypeName;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
