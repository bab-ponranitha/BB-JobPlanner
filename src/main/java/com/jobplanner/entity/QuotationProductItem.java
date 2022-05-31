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
@Table(name = "QUOTATION_PRODUCT_ITEM")
public class QuotationProductItem extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	
	private String productItemName;
	@ManyToOne
	@JoinColumn(name = "category", nullable = false,insertable = false,updatable = false)
	private RefProductCategory refProductCategory;
	
	private String formula;
	@ManyToOne
	@JoinColumn(name = "hardware_id", nullable = false)
	private Hardware hardware;
	
	private int quantity;
	private Double price;
	private Boolean active;

	public QuotationProductItem() {
	}

	public QuotationProductItem(int id, Product product, String productItemName, RefProductCategory refProductCategory,
			String formula, Hardware hardware, int quantity, Double price, Boolean active) {
		this.id = id;
		this.product = product;
		this.productItemName = productItemName;
		this.refProductCategory = refProductCategory;
		this.formula = formula;
		this.hardware = hardware;
		this.quantity = quantity;
		this.price = price;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductItemName() {
		return productItemName;
	}

	public void setProductItemName(String productItemName) {
		this.productItemName = productItemName;
	}

	public RefProductCategory getRefProductCategory() {
		return refProductCategory;
	}

	public void setRefProductCategory(RefProductCategory refProductCategory) {
		this.refProductCategory = refProductCategory;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
