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
@Table(name = "PRODUCT_ITEM")
public class ProductItem extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4496465098627489294L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "product_category_id", nullable = false,insertable = false,updatable = false)
	private RefProductCategory refProductCategory;
	
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false,insertable = false,updatable = false)
	private Product product;
	
	private String formula;
	private Boolean active;

	public ProductItem() {
		super();
	}

	public ProductItem(int id, String name, RefProductCategory refProductCategory, Product product, String formula,
			Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.refProductCategory = refProductCategory;
		this.product = product;
		this.formula = formula;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RefProductCategory getProductCategory() {
		return refProductCategory;
	}

	public void setProductCategory(RefProductCategory refProductCategory) {
		this.refProductCategory = refProductCategory;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
