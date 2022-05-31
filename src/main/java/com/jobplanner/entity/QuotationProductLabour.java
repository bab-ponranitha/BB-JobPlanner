package com.jobplanner.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "QUOTATION_PRODUCT_LABOUR")
public class QuotationProductLabour extends Auditable implements Serializable {

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
	@JoinColumn(name = "activity", nullable = false)
	private RefProductLabourActivity refProductLabourActivity;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date effort;
	private Double price;
	private Boolean active;

	public QuotationProductLabour() {
	}

	public QuotationProductLabour(int id, Product product, RefProductLabourActivity refProductLabourActivity,
			Date effort, Double price, Boolean active) {
		this.id = id;
		this.product = product;
		this.refProductLabourActivity = refProductLabourActivity;
		this.effort = effort;
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

	public RefProductLabourActivity getRefProductLabourActivity() {
		return refProductLabourActivity;
	}

	public void setRefProductLabourActivity(RefProductLabourActivity refProductLabourActivity) {
		this.refProductLabourActivity = refProductLabourActivity;
	}

	public Date getEffort() {
		return effort;
	}

	public void setEffort(Date effort) {
		this.effort = effort;
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
