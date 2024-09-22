package com.bricktobrick.B2BConnect.common;

public enum CommonExceptionMessage {
	
	REQUIRED_ATTRIBUTE(1, " %1$s is mandatory"), 
	VALIDATE_PIN(2, "Please enter only 4 digit PIN"),
	INCORRECT_PIN(3,"User PIN is incorrect."),
	ALREADY_EXISTS(4,"%1$S is already exists."),
	NOT_FOUND(5,"%1$S is not found"),
	INVALID_OTP(6, "Invalid otp");
	
	private int code;

	private String message;

	CommonExceptionMessage(int i, String message) {
		this.code = i;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessgae() {
		return message;
	}


}
