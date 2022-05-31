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
@Table(name = "SCOPE")
public class Scope extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private Boolean active;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="scope_id",nullable=false)
	private List<RoleScope> roleScope;

	public List<RoleScope> getRoleScope() {
		return roleScope;
	}

	public void setRoleScope(List<RoleScope> roleScope) {
		this.roleScope = roleScope;
	}

	public Scope() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
