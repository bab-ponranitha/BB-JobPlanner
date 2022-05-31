package com.jobplanner.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLE_SCOPE")
public class RoleScope extends Auditable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false,insertable=false,updatable=false)
	private Role role;
	@ManyToOne
	@JoinColumn(name = "scope_id", nullable = false,insertable=false,updatable=false)
	private Scope scope;
	
	private Boolean active;
	
	@OneToMany
	@JoinColumn(name = "role_scope_id", nullable = false)
	private List<UserRole> userRole;

	public RoleScope() {
	}

	public int getId() {
		return id;
	}

	public Role getRole() {
		return role;
	}

	public Scope getScope() {
		return scope;
	}

	public Boolean getActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}
}
