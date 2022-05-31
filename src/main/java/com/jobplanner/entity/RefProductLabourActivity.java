package com.jobplanner.entity;

import java.io.Serializable;
import java.sql.Time;
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
@Table(name = "REF_PRODUCT_LABOUR_ACTIVITY")
public class RefProductLabourActivity extends Auditable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3876655442158700972L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String activityName;
	private Time perHourCharge;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "product_activity_id")
	private List<ProductLabour> productLabour;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "activity")
	private List<QuotationProductLabour> quotationProductLabour;
	
	private Boolean active;

	public RefProductLabourActivity() {
		super();
	}

	public RefProductLabourActivity(int id, String activityName, Time perHourCharge, List<ProductLabour> productLabour,
			Boolean active) {
		super();
		this.id = id;
		this.activityName = activityName;
		this.perHourCharge = perHourCharge;
		this.productLabour = productLabour;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Time getPerHourCharge() {
		return perHourCharge;
	}

	public void setPerHourCharge(Time perHourCharge) {
		this.perHourCharge = perHourCharge;
	}

	public List<ProductLabour> getProductLabour() {
		return productLabour;
	}

	public void setProductLabour(List<ProductLabour> productLabour) {
		this.productLabour = productLabour;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
