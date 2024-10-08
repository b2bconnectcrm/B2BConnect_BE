package com.bricktobrick.B2BConnect.dtos;

import java.time.LocalDate;

import com.bricktobrick.B2BConnect.entity.Stage;

public class DealsDto {
	
	private Long id;

	private String dealName;

	private String clientName;

	private String accountName;

	private String SalesPipeline;

	private Stage stage;

	private String unitStatus;

	private String pancardFilePath;

	private String pancardNumber;

	private Long amount;

	private String forcastCategory;

	private String commissionPercent;

	private LocalDate closingDate;

	private String phone;

	private String projectType;

	private String subProjectType;

	private String referredBy;
	
	private Long employeeId;
	
	private Long leadId;

	private EmployeeDto employeeDto;

	private LeadDto leadDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDealName() {
		return dealName;
	}

	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getSalesPipeline() {
		return SalesPipeline;
	}

	public void setSalesPipeline(String salesPipeline) {
		SalesPipeline = salesPipeline;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public String getUnitStatus() {
		return unitStatus;
	}

	public void setUnitStatus(String unitStatus) {
		this.unitStatus = unitStatus;
	}

	public String getPancardFilePath() {
		return pancardFilePath;
	}

	public void setPancardFilePath(String pancardFilePath) {
		this.pancardFilePath = pancardFilePath;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getForcastCategory() {
		return forcastCategory;
	}

	public void setForcastCategory(String forcastCategory) {
		this.forcastCategory = forcastCategory;
	}

	public String getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(String commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public LocalDate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getSubProjectType() {
		return subProjectType;
	}

	public void setSubProjectType(String subProjectType) {
		this.subProjectType = subProjectType;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public EmployeeDto getEmployeeDto() {
		return employeeDto;
	}

	public void setEmployeeDto(EmployeeDto employeeDto) {
		this.employeeDto = employeeDto;
	}

	public LeadDto getLeadDto() {
		return leadDto;
	}

	public void setLeadDto(LeadDto leadDto) {
		this.leadDto = leadDto;
	}
	
	

}
