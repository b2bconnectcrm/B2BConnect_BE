package com.bricktobrick.B2BConnect.dtos;

import java.time.LocalDate;

import com.bricktobrick.B2BConnect.entity.Address;
import com.bricktobrick.B2BConnect.entity.PropertyType;

public class PropertyDto {
	
	private Long id;
	
	private String propertyName;
	
	private String companyName;
	
	private String reraNumber;
	
	private String guidelineValue;
	
	private String propertyType;
	
	private Long totalPlots;
	
	private String poc;
	
	private String mobile;
	
	private String amenities;
	
	private LocalDate startDate;
	
	private LocalDate extensionDate;
	
	private String propertyDescription;
	
	private String status;
	
	private Address address;
	
	private String propertyMap;
	

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

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
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
