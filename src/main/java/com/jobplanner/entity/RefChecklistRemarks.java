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
@Table(name = "REF_CHECKLIST_REMARKS")
public class RefChecklistRemarks extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4126614675701739182L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="remarks")
	private List<QaDetails> qaDetails;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="remarks_factory_check")
	private List<DeliveryDetails> remarksFactoryCheck;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="remarks_onsite_check")
	private List<DeliveryDetails> remarksOnsiteCheck;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="remarks_delivery_check")
	private List<DeliveryDetails> remarksDeliveryCheck;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="remarks")
	private List<InstallationDetails> installationDetails;
	
	public RefChecklistRemarks() {
	}

	public RefChecklistRemarks(int id, String name, Boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

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

}
