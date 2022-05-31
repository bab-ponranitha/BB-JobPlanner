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
@Table(name = "PRODUCT_SUNDRIES")
public class ProductSundries extends Auditable implements Serializable {
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
	@ManyToOne
	@JoinColumn(name = "sundries", nullable = false)
	private SunDry sunDry;
	private int qty;
	private Double price;
	private Boolean active;

	public ProductSundries(int id, Product product, SunDry sunDry, int qty, Double price, Boolean active) {
		this.id = id;
		this.product = product;
		this.sunDry = sunDry;
		this.qty = qty;
		this.price = price;
		this.active = active;
	}

	public ProductSundries() {
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

	public SunDry getSunDry() {
		return sunDry;
	}

	public void setSunDry(SunDry sunDry) {
		this.sunDry = sunDry;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
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
