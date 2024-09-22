package com.bricktobrick.B2BConnect.entity;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {

	private Long id;
	
	private String propertyName;
	
	private String companyName;
	
	private String reraNumber;
	
	private String guidelineValue;
	
	private PropertyType propertyType;
	
	private Long totalPlots;
	
	private String poc;
	
	private String mobile;
	
	private String amenities;
	
	private LocalDate startDate;
	
	private LocalDate extensionDate;
	
	private String propertyDescription;
	
	private String status;
	
	private Address address;
	
	// uploaded image path
	private String propertyMap;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getReraNumber() {
		return reraNumber;
	}

	public void setReraNumber(String reraNumber) {
		this.reraNumber = reraNumber;
	}

	public String getGuidelineValue() {
		return guidelineValue;
	}

	public void setGuidelineValue(String guidelineValue) {
		this.guidelineValue = guidelineValue;
	}

	@Enumerated(EnumType.STRING)
	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public Long getTotalPlots() {
		return totalPlots;
	}

	public void setTotalPlots(Long totalPlots) {
		this.totalPlots = totalPlots;
	}

	public String getPoc() {
		return poc;
	}

	public void setPoc(String poc) {
		this.poc = poc;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExtensionDate() {
		return extensionDate;
	}

	public void setExtensionDate(LocalDate extensionDate) {
		this.extensionDate = extensionDate;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPropertyMap() {
		return propertyMap;
	}

	public void setPropertyMap(String propertyMap) {
		this.propertyMap = propertyMap;
	}
	
	
}
