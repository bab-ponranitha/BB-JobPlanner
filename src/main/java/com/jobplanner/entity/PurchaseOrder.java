package com.jobplanner.entity;

import java.io.Serializable;
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "PURCHASE_ORDER")
public class PurchaseOrder extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "maintenance_record_id")
	private MaintenanceRecord maintenanceRecord;
	
	private int poNumber;
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "status")
	private RefPurchaseOrderStatus status;
	
	@ManyToOne
	@JoinColumn(name = "requestor")
	private User requestor;
	
	private String deliveryInstruction;
	private String notes;
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date requestedOn;
	@Temporal(TemporalType.TIMESTAMP)
	private Date receivedOn;
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="purchase_order_id")
	private List<PurchaseOrderDetails> purchaseOrderDetails;
	
	public PurchaseOrder() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public MaintenanceRecord getMaintenanceRecord() {
		return maintenanceRecord;
	}
	public void setMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
		this.maintenanceRecord = maintenanceRecord;
	}
	public int getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public RefPurchaseOrderStatus getStatus() {
		return status;
	}
	public void setStatus(RefPurchaseOrderStatus status) {
		this.status = status;
	}
	public User getRequestor() {
		return requestor;
	}
	public void setRequestor(User requestor) {
		this.requestor = requestor;
	}
	public String getDeliveryInstruction() {
		return deliveryInstruction;
	}
	public void setDeliveryInstruction(String deliveryInstruction) {
		this.deliveryInstruction = deliveryInstruction;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getRequestedOn() {
		return requestedOn;
	}
	public void setRequestedOn(Date requestedOn) {
		this.requestedOn = requestedOn;
	}
	public Date getReceivedOn() {
		return receivedOn;
	}
	public void setReceivedOn(Date receivedOn) {
		this.receivedOn = receivedOn;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<PurchaseOrderDetails> getPurchaseOrderDetails() {
		return purchaseOrderDetails;
	}
	public void setPurchaseOrderDetails(List<PurchaseOrderDetails> purchaseOrderDetails) {
		this.purchaseOrderDetails = purchaseOrderDetails;
	}	
	
}
