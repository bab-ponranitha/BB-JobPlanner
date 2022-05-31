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
@Table(name = "DELIVERY_DETAILS")
public class DeliveryDetails extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="delivery_checklist_id")
	private Delivery delivery;
	
	@ManyToOne
	@JoinColumn(name="checklist_id")
	private ChecklistSales checklist;
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="remarks_factory_check")
	private RefChecklistRemarks remarksFacoryCheck;
	
	private String customValueFactoryCheck;
	
	@ManyToOne
	@JoinColumn(name="remarks_delivery_check")
	private RefChecklistRemarks remarksDeliveryCheck;
	
	private String customValueDeliveryCheck;
	@ManyToOne
	@JoinColumn(name="remarks_onsite_check")
	private RefChecklistRemarks remarksOnsiteCheck;
	
	private String customValueOnsiteCheck;
	private String notes;
	private Boolean active;
	
	public DeliveryDetails() {
		super();
	}
	public DeliveryDetails(int id, Delivery delivery, ChecklistSales checklist, int quantity,
			RefChecklistRemarks remarksFacoryCheck, String customValueFactoryCheck,
			RefChecklistRemarks remarksDeliveryCheck, String customValueDeliveryCheck,
			RefChecklistRemarks remarksOnsiteCheck, String customValueOnsiteCheck, String notes, Boolean active) {
		this.id = id;
		this.delivery = delivery;
		this.checklist = checklist;
		this.quantity = quantity;
		this.remarksFacoryCheck = remarksFacoryCheck;
		this.customValueFactoryCheck = customValueFactoryCheck;
		this.remarksDeliveryCheck = remarksDeliveryCheck;
		this.customValueDeliveryCheck = customValueDeliveryCheck;
		this.remarksOnsiteCheck = remarksOnsiteCheck;
		this.customValueOnsiteCheck = customValueOnsiteCheck;
		this.notes = notes;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	public ChecklistSales getChecklist() {
		return checklist;
	}
	public void setChecklist(ChecklistSales checklist) {
		this.checklist = checklist;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public RefChecklistRemarks getRemarksFacoryCheck() {
		return remarksFacoryCheck;
	}
	public void setRemarksFacoryCheck(RefChecklistRemarks remarksFacoryCheck) {
		this.remarksFacoryCheck = remarksFacoryCheck;
	}
	public String getCustomValueFactoryCheck() {
		return customValueFactoryCheck;
	}
	public void setCustomValueFactoryCheck(String customValueFactoryCheck) {
		this.customValueFactoryCheck = customValueFactoryCheck;
	}
	public RefChecklistRemarks getRemarksDeliveryCheck() {
		return remarksDeliveryCheck;
	}
	public void setRemarksDeliveryCheck(RefChecklistRemarks remarksDeliveryCheck) {
		this.remarksDeliveryCheck = remarksDeliveryCheck;
	}
	public String getCustomValueDeliveryCheck() {
		return customValueDeliveryCheck;
	}
	public void setCustomValueDeliveryCheck(String customValueDeliveryCheck) {
		this.customValueDeliveryCheck = customValueDeliveryCheck;
	}
	public RefChecklistRemarks getRemarksOnsiteCheck() {
		return remarksOnsiteCheck;
	}
	public void setRemarksOnsiteCheck(RefChecklistRemarks remarksOnsiteCheck) {
		this.remarksOnsiteCheck = remarksOnsiteCheck;
	}
	public String getCustomValueOnsiteCheck() {
		return customValueOnsiteCheck;
	}
	public void setCustomValueOnsiteCheck(String customValueOnsiteCheck) {
		this.customValueOnsiteCheck = customValueOnsiteCheck;
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
