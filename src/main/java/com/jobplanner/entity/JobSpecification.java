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
@Table(name = "JOB_SPECIFICATION")
public class JobSpecification extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "job_id", nullable = false)
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "stone_benchtop_supplier", nullable = false)
	private Client client;
	
	private String stoneBenchTopThickness;
	private String stoneBenchTopColour;
	private String stoneBenchTopWaterfall;
	private String splashbackSupplier;
	private String splashbackType;
	private String splashbackColour;
	private String splashbackThickness;
	private String baseDoorsPanelsMaterial;
	private String baseDoorsPanelsFinish;
	private String baseDoorsPanelsColour;
	private String baseDoorsPanelsLink;
	private String baseDoorsPanelsHandleBrand;
	private String baseDoorsPanelsHandleType;
	private String baseDoorsPanelsHandleModelNo;
	private String baseDoorsPanelsHandlePlacement;
	private String upperDoorsPanelsMaterial;
	private String upperDoorsPanelsFinish;
	private String upperDoorsPanelsColour;
	private String upperDoorsPanelsLink;
	private String upperDoorsPanelsHandlerBrand;
	private String upperDoorsPanelsHandleType;
	private String upperDoorsPanelsHandleModelNo;
	private String upperDoorsPanelsHandlePlacement;
	private String tallDoorsPanelsMaterial;
	private String tallDoorsPanelsFinish;
	private String tallDoorsPanelsColour;
	private String tallDoorsPanelsLink;
	private String tallDoorsPanelsHandlerBrand;
	private String tallDoorsPanelsHandleType;
	private String tallDoorsPanelsHandleModelNo;
	private String tallDoorsPanelsHandlePlacement;
	private String kickBoardColour;
	private String barBackPanelsColour;
	private String ledStripLightColour;
	private String internalCarcaseMaterial;
	private String internalCarcaseEdge;
	private String floatingShelvesMaterila;
	private String flooringType;
	private Boolean active;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_spec_id")
	private List<JobSpecificationHardware> jobSpecificationHardware; 
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_spec_id")
	private List<JobSpecificationAppliances> jobSpecificationAppliances; 
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_spec_id")
	private List<MaintenanceRecord> maintenanceRecord; 
	
	public JobSpecification() {
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getStoneBenchTopThickness() {
		return stoneBenchTopThickness;
	}

	public void setStoneBenchTopThickness(String stoneBenchTopThickness) {
		this.stoneBenchTopThickness = stoneBenchTopThickness;
	}

	public String getStoneBenchTopColour() {
		return stoneBenchTopColour;
	}

	public void setStoneBenchTopColour(String stoneBenchTopColour) {
		this.stoneBenchTopColour = stoneBenchTopColour;
	}

	public String getStoneBenchTopWaterfall() {
		return stoneBenchTopWaterfall;
	}

	public void setStoneBenchTopWaterfall(String stoneBenchTopWaterfall) {
		this.stoneBenchTopWaterfall = stoneBenchTopWaterfall;
	}

	public String getSplashbackSupplier() {
		return splashbackSupplier;
	}

	public void setSplashbackSupplier(String splashbackSupplier) {
		this.splashbackSupplier = splashbackSupplier;
	}

	public String getSplashbackType() {
		return splashbackType;
	}

	public void setSplashbackType(String splashbackType) {
		this.splashbackType = splashbackType;
	}

	public String getSplashbackColour() {
		return splashbackColour;
	}

	public void setSplashbackColour(String splashbackColour) {
		this.splashbackColour = splashbackColour;
	}

	public String getSplashbackThickness() {
		return splashbackThickness;
	}

	public void setSplashbackThickness(String splashbackThickness) {
		this.splashbackThickness = splashbackThickness;
	}

	public String getBaseDoorsPanelsMaterial() {
		return baseDoorsPanelsMaterial;
	}

	public void setBaseDoorsPanelsMaterial(String baseDoorsPanelsMaterial) {
		this.baseDoorsPanelsMaterial = baseDoorsPanelsMaterial;
	}

	public String getBaseDoorsPanelsFinish() {
		return baseDoorsPanelsFinish;
	}

	public void setBaseDoorsPanelsFinish(String baseDoorsPanelsFinish) {
		this.baseDoorsPanelsFinish = baseDoorsPanelsFinish;
	}

	public String getBaseDoorsPanelsColour() {
		return baseDoorsPanelsColour;
	}

	public void setBaseDoorsPanelsColour(String baseDoorsPanelsColour) {
		this.baseDoorsPanelsColour = baseDoorsPanelsColour;
	}

	public String getBaseDoorsPanelsLink() {
		return baseDoorsPanelsLink;
	}

	public void setBaseDoorsPanelsLink(String baseDoorsPanelsLink) {
		this.baseDoorsPanelsLink = baseDoorsPanelsLink;
	}

	public String getBaseDoorsPanelsHandleBrand() {
		return baseDoorsPanelsHandleBrand;
	}

	public void setBaseDoorsPanelsHandleBrand(String baseDoorsPanelsHandleBrand) {
		this.baseDoorsPanelsHandleBrand = baseDoorsPanelsHandleBrand;
	}

	public String getBaseDoorsPanelsHandleType() {
		return baseDoorsPanelsHandleType;
	}

	public void setBaseDoorsPanelsHandleType(String baseDoorsPanelsHandleType) {
		this.baseDoorsPanelsHandleType = baseDoorsPanelsHandleType;
	}

	public String getBaseDoorsPanelsHandleModelNo() {
		return baseDoorsPanelsHandleModelNo;
	}

	public void setBaseDoorsPanelsHandleModelNo(String baseDoorsPanelsHandleModelNo) {
		this.baseDoorsPanelsHandleModelNo = baseDoorsPanelsHandleModelNo;
	}

	public String getBaseDoorsPanelsHandlePlacement() {
		return baseDoorsPanelsHandlePlacement;
	}

	public void setBaseDoorsPanelsHandlePlacement(String baseDoorsPanelsHandlePlacement) {
		this.baseDoorsPanelsHandlePlacement = baseDoorsPanelsHandlePlacement;
	}

	public String getUpperDoorsPanelsMaterial() {
		return upperDoorsPanelsMaterial;
	}

	public void setUpperDoorsPanelsMaterial(String upperDoorsPanelsMaterial) {
		this.upperDoorsPanelsMaterial = upperDoorsPanelsMaterial;
	}

	public String getUpperDoorsPanelsFinish() {
		return upperDoorsPanelsFinish;
	}

	public void setUpperDoorsPanelsFinish(String upperDoorsPanelsFinish) {
		this.upperDoorsPanelsFinish = upperDoorsPanelsFinish;
	}

	public String getUpperDoorsPanelsColour() {
		return upperDoorsPanelsColour;
	}

	public void setUpperDoorsPanelsColour(String upperDoorsPanelsColour) {
		this.upperDoorsPanelsColour = upperDoorsPanelsColour;
	}

	public String getUpperDoorsPanelsLink() {
		return upperDoorsPanelsLink;
	}

	public void setUpperDoorsPanelsLink(String upperDoorsPanelsLink) {
		this.upperDoorsPanelsLink = upperDoorsPanelsLink;
	}

	public String getUpperDoorsPanelsHandlerBrand() {
		return upperDoorsPanelsHandlerBrand;
	}

	public void setUpperDoorsPanelsHandlerBrand(String upperDoorsPanelsHandlerBrand) {
		this.upperDoorsPanelsHandlerBrand = upperDoorsPanelsHandlerBrand;
	}

	public String getUpperDoorsPanelsHandleType() {
		return upperDoorsPanelsHandleType;
	}

	public void setUpperDoorsPanelsHandleType(String upperDoorsPanelsHandleType) {
		this.upperDoorsPanelsHandleType = upperDoorsPanelsHandleType;
	}

	public String getUpperDoorsPanelsHandleModelNo() {
		return upperDoorsPanelsHandleModelNo;
	}

	public void setUpperDoorsPanelsHandleModelNo(String upperDoorsPanelsHandleModelNo) {
		this.upperDoorsPanelsHandleModelNo = upperDoorsPanelsHandleModelNo;
	}

	public String getUpperDoorsPanelsHandlePlacement() {
		return upperDoorsPanelsHandlePlacement;
	}

	public void setUpperDoorsPanelsHandlePlacement(String upperDoorsPanelsHandlePlacement) {
		this.upperDoorsPanelsHandlePlacement = upperDoorsPanelsHandlePlacement;
	}

	public String getTallDoorsPanelsMaterial() {
		return tallDoorsPanelsMaterial;
	}

	public void setTallDoorsPanelsMaterial(String tallDoorsPanelsMaterial) {
		this.tallDoorsPanelsMaterial = tallDoorsPanelsMaterial;
	}

	public String getTallDoorsPanelsFinish() {
		return tallDoorsPanelsFinish;
	}

	public void setTallDoorsPanelsFinish(String tallDoorsPanelsFinish) {
		this.tallDoorsPanelsFinish = tallDoorsPanelsFinish;
	}

	public String getTallDoorsPanelsColour() {
		return tallDoorsPanelsColour;
	}

	public void setTallDoorsPanelsColour(String tallDoorsPanelsColour) {
		this.tallDoorsPanelsColour = tallDoorsPanelsColour;
	}

	public String getTallDoorsPanelsLink() {
		return tallDoorsPanelsLink;
	}

	public void setTallDoorsPanelsLink(String tallDoorsPanelsLink) {
		this.tallDoorsPanelsLink = tallDoorsPanelsLink;
	}

	public String getTallDoorsPanelsHandlerBrand() {
		return tallDoorsPanelsHandlerBrand;
	}

	public void setTallDoorsPanelsHandlerBrand(String tallDoorsPanelsHandlerBrand) {
		this.tallDoorsPanelsHandlerBrand = tallDoorsPanelsHandlerBrand;
	}

	public String getTallDoorsPanelsHandleType() {
		return tallDoorsPanelsHandleType;
	}

	public void setTallDoorsPanelsHandleType(String tallDoorsPanelsHandleType) {
		this.tallDoorsPanelsHandleType = tallDoorsPanelsHandleType;
	}

	public String getTallDoorsPanelsHandleModelNo() {
		return tallDoorsPanelsHandleModelNo;
	}

	public void setTallDoorsPanelsHandleModelNo(String tallDoorsPanelsHandleModelNo) {
		this.tallDoorsPanelsHandleModelNo = tallDoorsPanelsHandleModelNo;
	}

	public String getTallDoorsPanelsHandlePlacement() {
		return tallDoorsPanelsHandlePlacement;
	}

	public void setTallDoorsPanelsHandlePlacement(String tallDoorsPanelsHandlePlacement) {
		this.tallDoorsPanelsHandlePlacement = tallDoorsPanelsHandlePlacement;
	}

	public String getKickBoardColour() {
		return kickBoardColour;
	}

	public void setKickBoardColour(String kickBoardColour) {
		this.kickBoardColour = kickBoardColour;
	}

	public String getBarBackPanelsColour() {
		return barBackPanelsColour;
	}

	public void setBarBackPanelsColour(String barBackPanelsColour) {
		this.barBackPanelsColour = barBackPanelsColour;
	}

	public String getLedStripLightColour() {
		return ledStripLightColour;
	}

	public void setLedStripLightColour(String ledStripLightColour) {
		this.ledStripLightColour = ledStripLightColour;
	}

	public String getInternalCarcaseMaterial() {
		return internalCarcaseMaterial;
	}

	public void setInternalCarcaseMaterial(String internalCarcaseMaterial) {
		this.internalCarcaseMaterial = internalCarcaseMaterial;
	}

	public String getInternalCarcaseEdge() {
		return internalCarcaseEdge;
	}

	public void setInternalCarcaseEdge(String internalCarcaseEdge) {
		this.internalCarcaseEdge = internalCarcaseEdge;
	}

	public String getFloatingShelvesMaterila() {
		return floatingShelvesMaterila;
	}

	public void setFloatingShelvesMaterila(String floatingShelvesMaterila) {
		this.floatingShelvesMaterila = floatingShelvesMaterila;
	}

	public String getFlooringType() {
		return flooringType;
	}

	public void setFlooringType(String flooringType) {
		this.flooringType = flooringType;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
