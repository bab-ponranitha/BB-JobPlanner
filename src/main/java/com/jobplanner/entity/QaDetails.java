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
@Table(name = "QA_DETAILS")
public class QaDetails extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "qa_id", nullable = false)
	private Qa qa;
	
	@ManyToOne
	@JoinColumn(name = "checklist_id", nullable = false)
	private ChecklistSales checklistSales;
	
	@ManyToOne
	@JoinColumn(name = "remarks", nullable = false)
	private RefChecklistRemarks remarks;
	
	private String customValue;
	private Boolean active;

	public QaDetails() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Qa getQa() {
		return qa;
	}

	public void setQa(Qa qa) {
		this.qa = qa;
	}

	public ChecklistSales getChecklistSales() {
		return checklistSales;
	}

	public void setChecklistSales(ChecklistSales checklistSales) {
		this.checklistSales = checklistSales;
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
