package com.bricktobrick.B2BConnect.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

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
	
	private boolean clientInterested;
	
	private boolean crossSegmentLeads;
	
	private NotInterestedStatus notINterestedStatus;
	
	private PropertyType propertyType;
	
	private SubPropetyType subPropetyType;
	
	private SalesPipeline salesPipeline;
	
	private String comments;
	
	private String crossSegments;
	
	private VisitType plantodo;
	
	
	private List<Deals> deals;
	
	private List<Property> properties;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lead_seq_id")
	@SequenceGenerator(name = "lead_seq_id", sequenceName = "lead_seq_id", allocationSize = 1)
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

	@JsonIgnore
	@JsonProperty
	@OneToMany(cascade = CascadeType.ALL)
	public List<Deals> getDeals() {
		return deals;
	}

	public void setDeals(List<Deals> deals) {
		this.deals = deals;
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

	@Enumerated(EnumType.STRING)
	public NotInterestedStatus getNotINterestedStatus() {
		return notINterestedStatus;
	}

	public void setNotINterestedStatus(NotInterestedStatus notINterestedStatus) {
		this.notINterestedStatus = notINterestedStatus;
	}


	@Enumerated(EnumType.STRING)
	public SalesPipeline getSalesPipeline() {
		return salesPipeline;
	}

	public void setSalesPipeline(SalesPipeline salesPipeline) {
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

	@Enumerated(EnumType.STRING)
	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	@Enumerated(EnumType.STRING)
	public SubPropetyType getSubPropetyType() {
		return subPropetyType;
	}

	public void setSubPropetyType(SubPropetyType subPropetyType) {
		this.subPropetyType = subPropetyType;
	}

	@Enumerated(EnumType.STRING)
	public VisitType getPlantodo() {
		return plantodo;
	}

	public void setPlantodo(VisitType plantodo) {
		this.plantodo = plantodo;
	}

	@JsonIgnore
	@JsonProperty
	@OneToMany(cascade = CascadeType.MERGE)
	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	
	


}
