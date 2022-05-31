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
@Table(name = "REF_PRODUCT_CATEGORY")
public class RefProductCategory extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "product_category_id", nullable = false)
	private List<ProductItem> productItem;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "product_category_id", nullable = false)
	private List<Hardware> hardware;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "category", nullable = false)
	private List<QuotationProductItem> quotationProductItem;
	
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<ProductItem> getProductItem() {
		return productItem;
	}

	public void setProductItem(List<ProductItem> productItem) {
		this.productItem = productItem;
	}

	public RefProductCategory() {
		super();
	}

	public RefProductCategory(int id, String name, Boolean active, List<ProductItem> productItem) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
		this.productItem = productItem;
	}

}
