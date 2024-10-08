package com.bricktobrick.B2BConnect.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Deals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String dealName;

	private String clientName;

	private String accountName;

	private SalesPipeline SalesPipeline;

	private Stage stage;

	private UnitStatus unitStatus;

	private String pancardFilePath;

	private String pancardNumber;

	private Long amount;

	private String forcastCategory;

	private String commissionPercent;

	private LocalDate closingDate;

	private String phone;

	private ProjectType projectType;

	private String subProjectType;

	private String referredBy;

	private Employee employee;

	private Lead lead;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deals_seq_id")
	@SequenceGenerator(name = "deals_seq_id", sequenceName = "deals_seq_id", allocationSize = 1)
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

	@Enumerated(EnumType.STRING)
	public SalesPipeline getSalesPipeline() {
		return SalesPipeline;
	}

	public void setSalesPipeline(SalesPipeline salesPipeline) {
		SalesPipeline = salesPipeline;
	}

	@Enumerated(EnumType.STRING)
	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	@Enumerated(EnumType.STRING)
	public UnitStatus getUnitStatus() {
		return unitStatus;
	}

	public void setUnitStatus(UnitStatus unitStatus) {
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

	@Enumerated(EnumType.STRING)
	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
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

	@ManyToOne
	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
