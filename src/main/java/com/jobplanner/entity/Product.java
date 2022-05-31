package com.jobplanner.entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "PRODUCT")
public class Product extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 461894922762164043L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	
	@ManyToOne
	@JoinColumn(name = "product_type_id", nullable = false, insertable = false, updatable = false)
	private RefProductType refProductType;
	
	private Double width;
	private Double height;
	private Double depth;
	private Boolean active;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<ProductLabour> productLabour;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<ProductItem> productItem;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<QuotationProduct> quotationProduct;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<QuotationProductItem> quotationProductItem;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<QuotationProductLabour> quotationProductLabour;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<ProductSundries> productSundries;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<InstallationOrderDetails> installationOrderDetails;

	public Product() {
		super();
	}

	public Product(int id, String productName, RefProductType refProductType, Double width, Double height, Double depth,
			Boolean active, List<ProductLabour> productLabour, List<ProductItem> productItem) {
		super();
		this.id = id;
		this.productName = productName;
		this.refProductType = refProductType;
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.active = active;
		this.productLabour = productLabour;
		this.productItem = productItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public RefProductType getProductType() {
		return refProductType;
	}

	public void setProductType(RefProductType refProductType) {
		this.refProductType = refProductType;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<ProductLabour> getProductLabour() {
		return productLabour;
	}

	public void setProductLabour(List<ProductLabour> productLabour) {
		this.productLabour = productLabour;
	}

	public List<ProductItem> getProductItem() {
		return productItem;
	}

	public void setProductItem(List<ProductItem> productItem) {
		this.productItem = productItem;
	}
}
