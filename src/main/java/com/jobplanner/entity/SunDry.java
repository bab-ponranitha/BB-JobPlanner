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
@Table(name = "SUN_DRY")
public class SunDry extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9208617346420164532L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String category;
	private String name;
	private Double price;
	private Boolean active;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "sundries")
	private List<ProductSundries> productSundries;

	public SunDry() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<ProductSundries> getProductSundries() {
		return productSundries;
	}

	public void setProductSundries(List<ProductSundries> productSundries) {
		this.productSundries = productSundries;
	}
}
