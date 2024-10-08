package com.bricktobrick.B2BConnect.dtos;

import java.util.List;

import com.bricktobrick.B2BConnect.entity.Address;

public class LeadDto {

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

	private String leadSource;

	private String leadStatus;

	private String createdDate;

	private String owner;

	private boolean clientInterested;

	private boolean crossSegmentLeads;

	private String notINterestedStatus;
	
	private String propertyType;

	private String subPropertyType;

	private String salesPipeline;

	private String comments;

	private String crossSegments;
	
	private  String plantodo;
	
	private List<PropertyDto> properties;

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

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isClientInterested() {
		return clientInterested;
	}

	public void setClientInterested(boolean clientInterested) {
		this.clientInterested = clientInterested;
	}

	public boolean isCrossSegmentLeads() {
		return crossSegmentLeads;
	}

	public void setCrossSegmentLeads(boolean crossSegmentLeads) {
		this.crossSegmentLeads = crossSegmentLeads;
	}

	public String getNotINterestedStatus() {
		return notINterestedStatus;
	}

	public void setNotINterestedStatus(String notINterestedStatus) {
		this.notINterestedStatus = notINterestedStatus;
	}

	

	public String getSalesPipeline() {
		return salesPipeline;
	}

	public void setSalesPipeline(String salesPipeline) {
		this.salesPipeline = salesPipeline;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCrossSegments() {
		return crossSegments;
	}

	public void setCrossSegments(String crossSegments) {
		this.crossSegments = crossSegments;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getSubPropertyType() {
		return subPropertyType;
	}

	public void setSubPropertyType(String subPropertyType) {
		this.subPropertyType = subPropertyType;
	}

	public String getPlantodo() {
		return plantodo;
	}

	public void setPlantodo(String plantodo) {
		this.plantodo = plantodo;
	}

	public List<PropertyDto> getProperties() {
		return properties;
	}

	public void setProperties(List<PropertyDto> properties) {
		this.properties = properties;
	}

	
	
	
}
