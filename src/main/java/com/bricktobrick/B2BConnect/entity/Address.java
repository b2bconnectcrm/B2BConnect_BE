package com.bricktobrick.B2BConnect.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String houseNo;
	
	private String street;
	
	private String village;
	
	private String mandal;
	
	private String district;
	
	private String state;
	
	private String pincode;
	
	private String directions;
	

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", village=" + village + ", mandal=" + mandal
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + ", directions=" + directions
				+ "]";
	}


}
