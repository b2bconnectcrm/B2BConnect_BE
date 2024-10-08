package com.bricktobrick.B2BConnect.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String roleName;

	private String roleDisplayName;

	private String description;

	private Department department;

	private UserAccount user;

	public Role(Long id, String roleName, String roleDisplayName, String description, UserAccount user) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.roleDisplayName = roleDisplayName;
		this.description = description;
		this.user = user;
	}

	public Role() {
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq_id")
	@SequenceGenerator(name = "role_seq_id", sequenceName = "role_seq_id", allocationSize = 1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDisplayName() {
		return roleDisplayName;
	}

	public void setRoleDisplayName(String roleDisplayName) {
		this.roleDisplayName = roleDisplayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	@OneToOne
	public UserAccount getUser() {
		return user;
	}

	public void setUser(UserAccount user) {
		this.user = user;
	}

	@Enumerated
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
