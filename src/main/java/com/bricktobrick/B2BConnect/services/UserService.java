package com.bricktobrick.B2BConnect.services;

import com.bricktobrick.B2BConnect.dtos.UserDto;

public interface UserService {

	void createUser(UserDto userDto);

	UserDto login(UserDto userDto);

	void verifyOtp(UserDto userDto);

	void deleteUser(Long id);

}
