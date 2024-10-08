package com.bricktobrick.B2BConnect.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String email;

	private String mobile;

	private Address address;
	
	private String aadharNumber;
	
	private String pancardNumber;
	
	private String username;
	
	private Role role;

	private String department;

	private String aadharFilePath;
	
	private String pancardFilePath;
	
	private UserAccount userAccount;
	
	private List<Deals> deals;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@ManyToOne
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAadharFilePath() {
		return aadharFilePath;
	}

	public void setAadharFilePath(String aadharFilePath) {
		this.aadharFilePath = aadharFilePath;
	}

	public String getPancardFilePath() {
		return pancardFilePath;
	}

	public void setPancardFilePath(String pancardFilePath) {
		this.pancardFilePath = pancardFilePath;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	@JsonIgnore
	@JsonProperty
	@OneToMany(cascade = CascadeType.ALL)
	public List<Deals> getDeals() {
		return deals;
	}

	public void setDeals(List<Deals> deals) {
		this.deals = deals;
	}

	
	
	
	
	

}
