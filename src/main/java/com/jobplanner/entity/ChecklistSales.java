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
@Table(name = "CHECKLIST_SALES")
public class ChecklistSales extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "module")
	private RefChecklistModule module;
	
	private String details;
	private String type;
	private Boolean active;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "checklist_id")
	private List<QaDetails> qaDetails;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "checklist_id")
	private List<DeliveryDetails> deliveryDetails;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "checklist_id")
	private List<InstallationDetails> installationDetails;

	public ChecklistSales() {
	}

	public ChecklistSales(int id, RefChecklistModule module, String details, String type, Boolean active,
			List<QaDetails> qaDetails, List<DeliveryDetails> deliveryDetails) {
		this.id = id;
		this.module = module;
		this.details = details;
		this.type = type;
		this.active = active;
		this.qaDetails = qaDetails;
		this.deliveryDetails = deliveryDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RefChecklistModule getModule() {
		return module;
	}

	public void setModule(RefChecklistModule module) {
		this.module = module;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<QaDetails> getQaDetails() {
		return qaDetails;
	}

	public void setQaDetails(List<QaDetails> qaDetails) {
		this.qaDetails = qaDetails;
	}

	public List<DeliveryDetails> getDeliveryDetails() {
		return deliveryDetails;
	}

	public void setDeliveryDetails(List<DeliveryDetails> deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

}
