package com.bricktobrick.B2BConnect.dtos;

import com.bricktobrick.B2BConnect.entity.Address;
import com.bricktobrick.B2BConnect.entity.UserAccount;

public class EmployeeDto {
	
	private Long id;

	private String name;

	private String email;

	private String mobile;

	private Address address;
	
	private String aadharNumber;
	
	private String pancardNumber;
	
	private String username;
	
	private RoleDto role;

	private String department;

	private String aadharFilePath;
	
	private String pancardFilePath;
	
	private UserAccount userAccount;
	

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

	public RoleDto getRole() {
		return role;
	}

	public void setRole(RoleDto role) {
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

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}


}
