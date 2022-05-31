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
@Table(name="USER_ROLE")
public class UserRole extends Auditable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;	
	@ManyToOne
	@JoinColumn(name="role_scope_id",nullable=false,insertable=false,updatable=false)
	private RoleScope roleScope;
	private Boolean active;
	public UserRole() {
	}
	public int getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public RoleScope getRoleScope() {
		return roleScope;
	}
	public Boolean getActive() {
		return active;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setRoleScope(RoleScope roleScope) {
		this.roleScope = roleScope;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
