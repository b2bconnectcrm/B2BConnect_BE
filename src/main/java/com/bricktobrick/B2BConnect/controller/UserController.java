package com.bricktobrick.B2BConnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bricktobrick.B2BConnect.dtos.UserDto;
import com.bricktobrick.B2BConnect.services.UserService;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(value = "/add")
	public void createUser(@RequestBody UserDto userDto) {
		userService.createUser(userDto);
	}

	@PostMapping(value = "/login")
	public UserDto login(@RequestBody UserDto userDto) {
		return userService.login(userDto);
	}
	
	@PostMapping(value = "/verifyOtp")
	public void verifyOtp(@RequestBody UserDto userDto) {
		 userService.verifyOtp(userDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable(value = "id") Long id) {
		 userService.deleteUser(id);
	}
}
