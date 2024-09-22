package com.bricktobrick.B2BConnect.builders;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;

@Component
public class OTPBuilder {

	public String generateOtp(int length) {

		SecureRandom random = new SecureRandom();

		String digits = "0123456789";

		StringBuilder otp = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(digits.length());
			otp.append(digits.charAt(index));
		}
		return otp.toString();
	}

}
