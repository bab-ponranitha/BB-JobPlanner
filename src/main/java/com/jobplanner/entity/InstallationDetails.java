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
@Table(name = "INSTALLATION_DETAILS")
public class InstallationDetails extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "installation_checklist_id")
	private Installation installation;
	
	@ManyToOne
	@JoinColumn(name = "checklist_id")
	private ChecklistSales checklist;
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "remarks")
	private RefChecklistRemarks remarks;
	
	private String customValue;
	private Boolean active;

	public InstallationDetails() {
	}

	public InstallationDetails(int id, Installation installation, ChecklistSales checklist, int quantity,
			RefChecklistRemarks remarks, String customValue, Boolean active) {
		this.id = id;
		this.installation = installation;
		this.checklist = checklist;
		this.quantity = quantity;
		this.remarks = remarks;
		this.customValue = customValue;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Installation getInstallation() {
		return installation;
	}

	public void setInstallation(Installation installation) {
		this.installation = installation;
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

	public RefChecklistRemarks getRemarks() {
		return remarks;
	}

	public void setRemarks(RefChecklistRemarks remarks) {
		this.remarks = remarks;
	}

	public String getCustomValue() {
		return customValue;
	}

	public void setCustomValue(String customValue) {
		this.customValue = customValue;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
