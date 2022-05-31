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
@Table(name = "INSTALLATION_ORDER_DETAILS")
public class InstallationOrderDetails extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="installation_order_id")
	private InstallationOrder installationOrder;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	private int quantity;
	private Double price;
	private String notes;
	private Boolean active;
	
	public InstallationOrderDetails() {
	}
	public InstallationOrderDetails(int id, InstallationOrder installationOrder, Product product, int quantity,
			Double price, String notes, Boolean active) {
		this.id = id;
		this.installationOrder = installationOrder;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.notes = notes;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public InstallationOrder getInstallationOrder() {
		return installationOrder;
	}
	public void setInstallationOrder(InstallationOrder installationOrder) {
		this.installationOrder = installationOrder;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
}
