package com.bricktobrick.B2BConnect.builders;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.UserDto;
import com.bricktobrick.B2BConnect.entity.UserAccount;

@Component
public class UserBuilder {

	public UserAccount convertToModel(UserDto userDto) {
		// TODO Auto-generated method stub
		UserAccount user = new UserAccount();
		user.setCreatedDate(LocalDate.now());
		user.setId(userDto.getId());
		user.setLoginType(userDto.getLoginType());
		user.setMobile(userDto.getMobile());
		user.setOtp(userDto.getOtp());
		user.setPassword(userDto.getPassword());
		user.setRole(userDto.getRole());
		user.setUsername(userDto.getUsername());
		return user;
	}
	
	

}
