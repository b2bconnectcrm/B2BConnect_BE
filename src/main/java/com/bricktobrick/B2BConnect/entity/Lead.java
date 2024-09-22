package com.bricktobrick.B2BConnect.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lead implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String occupation;
	
	private String mobile;
	
	private String email;
	
	private Address address;
	
	private String annualIncome;
	
	private String industry;
	
	private LeadSource leadSource;
	
	private LeadStatus leadStatus;
	
	private LocalDate createdDate;
	
	private String owner;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@Enumerated(EnumType.STRING)
	public LeadSource getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(LeadSource leadSource) {
		this.leadSource = leadSource;
	}

	@Enumerated(EnumType.STRING)
	public LeadStatus getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(LeadStatus leadStatus) {
		this.leadStatus = leadStatus;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	


}
