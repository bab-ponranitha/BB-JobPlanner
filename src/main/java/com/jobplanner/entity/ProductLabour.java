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
@Table(name = "PRODUCT_LABOUR")
public class ProductLabour extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 640000475164589325L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "product_activity_id", nullable = false,insertable = false,updatable = false)
	private RefProductLabourActivity refProductLabourActivity;
	private Boolean active;

	public ProductLabour() {
		super();
	}

	public ProductLabour(int id, Product product, RefProductLabourActivity refProductLabourActivity, Boolean active) {
		super();
		this.id = id;
		this.product = product;
		this.refProductLabourActivity = refProductLabourActivity;
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

	public RefProductLabourActivity getProductLabourActivity() {
		return refProductLabourActivity;
	}

	public void setProductLabourActivity(RefProductLabourActivity refProductLabourActivity) {
		this.refProductLabourActivity = refProductLabourActivity;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
