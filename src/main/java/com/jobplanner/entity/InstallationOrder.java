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
@Table(name = "INSTALLATION_ORDER")
public class InstallationOrder extends Auditable implements Serializable {

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
	
	@ManyToOne
	@JoinColumn(name = "installer_id")
	private Installer installer;
	
	@Temporal(TemporalType.TIME)
	private Date installedDate;
	private String instruction;
	private String notes;
	private int totalItems;
	private Double subTotal;
	private Double gst;
	private Double total;
	
	@ManyToOne
	@JoinColumn(name = "installer_status_id")
	private RefInstallationStatus installerStatus;
	
	@ManyToOne
	@JoinColumn(name = "installer_confirmed_by")
	private User installerConfirmedBy;
	
	@Temporal(TemporalType.TIME)
	private Date installerConfirmedOn;
	
	@ManyToOne
	@JoinColumn(name = "client_status")
	private RefInstallationStatus clientStatus;
	
	@Temporal(TemporalType.TIME)
	private Date clientConfirmedOn;
	private Boolean active;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "installation_order_id")
	private List<InstallationOrderDetails> installationOrderDetails;

	public InstallationOrder(int id, Job job, MaintenanceRecord maintenanceRecord, Installer installer,
			Date installedDate, String instruction, String notes, int totalItems, Double subTotal, Double gst,
			Double total, RefInstallationStatus installerStatus, User installerConfirmedBy, Date installerConfirmedOn,
			RefInstallationStatus clientStatus, Date clientConfirmedOn, Boolean active,
			List<InstallationOrderDetails> installationOrderDetails) {
		this.id = id;
		this.job = job;
		this.maintenanceRecord = maintenanceRecord;
		this.installer = installer;
		this.installedDate = installedDate;
		this.instruction = instruction;
		this.notes = notes;
		this.totalItems = totalItems;
		this.subTotal = subTotal;
		this.gst = gst;
		this.total = total;
		this.installerStatus = installerStatus;
		this.installerConfirmedBy = installerConfirmedBy;
		this.installerConfirmedOn = installerConfirmedOn;
		this.clientStatus = clientStatus;
		this.clientConfirmedOn = clientConfirmedOn;
		this.active = active;
		this.installationOrderDetails = installationOrderDetails;
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

	public Installer getInstaller() {
		return installer;
	}

	public void setInstaller(Installer installer) {
		this.installer = installer;
	}

	public Date getInstalledDate() {
		return installedDate;
	}

	public void setInstalledDate(Date installedDate) {
		this.installedDate = installedDate;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getGst() {
		return gst;
	}

	public void setGst(Double gst) {
		this.gst = gst;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public RefInstallationStatus getInstallerStatus() {
		return installerStatus;
	}

	public void setInstallerStatus(RefInstallationStatus installerStatus) {
		this.installerStatus = installerStatus;
	}

	public User getInstallerConfirmedBy() {
		return installerConfirmedBy;
	}

	public void setInstallerConfirmedBy(User installerConfirmedBy) {
		this.installerConfirmedBy = installerConfirmedBy;
	}

	public Date getInstallerConfirmedOn() {
		return installerConfirmedOn;
	}

	public void setInstallerConfirmedOn(Date installerConfirmedOn) {
		this.installerConfirmedOn = installerConfirmedOn;
	}

	public RefInstallationStatus getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(RefInstallationStatus clientStatus) {
		this.clientStatus = clientStatus;
	}

	public Date getClientConfirmedOn() {
		return clientConfirmedOn;
	}

	public void setClientConfirmedOn(Date clientConfirmedOn) {
		this.clientConfirmedOn = clientConfirmedOn;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<InstallationOrderDetails> getInstallationOrderDetails() {
		return installationOrderDetails;
	}

	public void setInstallationOrderDetails(List<InstallationOrderDetails> installationOrderDetails) {
		this.installationOrderDetails = installationOrderDetails;
	}
}