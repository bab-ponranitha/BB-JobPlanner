package com.jobplanner.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "HARDWARE")
public class Hardware extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String stockCode;
	private String name;
	private String brand;
	private String finish;
	private String finishingRange;
	private String colour;
	private Double length;
	private Double width;
	private Double thickness;
	private String rateTypeName;
	private Double purchasePrice;
	private Double sellPrice;
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="hardware_id")
	private List<HardwareCategory> hardwareCategory;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "hardware_id")
	private List<DrawerDetail> drawerDetail;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "hardware_id")
	private List<SupplierHardware> supplierHardware;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "hardware_id")
	private List<JobSpecificationHardware> jobSpecificationHardware;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "hardware_id")
	private List<QuotationProductItem> quotationProductItem;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "hardware_id")
	private List<RawMaterial> rawMaterial;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="hardware_id")
	private List<PurchaseOrderDetails> purchaseOrderDetails;
	
	public List<DrawerDetail> getDrawerDetail() {
		return drawerDetail;
	}

	public void setDrawerDetail(List<DrawerDetail> drawerDetail) {
		this.drawerDetail = drawerDetail;
	}

	public List<SupplierHardware> getSupplierHardware() {
		return supplierHardware;
	}

	public void setSupplierHardware(List<SupplierHardware> supplierHardware) {
		this.supplierHardware = supplierHardware;
	}

	public Hardware() {
	}

	public Hardware(int id, String stockCode, String name, String brand, String finish, String finishingRange,
			String colour, Double length, Double width, Double thickness, String rateTypeName, Double purchasePrice,
			Double sellPrice, Boolean active) {
		this.id = id;
		this.stockCode = stockCode;
		this.name = name;
		this.brand = brand;
		this.finish = finish;
		this.finishingRange = finishingRange;
		this.colour = colour;
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

	public void setId(int id) {
		this.id = id;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getFinishingRange() {
		return finishingRange;
	}

	public void setFinishingRange(String finishingRange) {
		this.finishingRange = finishingRange;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getThickness() {
		return thickness;
	}

	public void setThickness(Double thickness) {
		this.thickness = thickness;
	}

	public String getRateTypeName() {
		return rateTypeName;
	}

	public void setRateTypeName(String rateTypeName) {
		this.rateTypeName = rateTypeName;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
