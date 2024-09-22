package com.bricktobrick.B2BConnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bricktobrick.B2BConnect.dtos.EmployeeDto;
import com.bricktobrick.B2BConnect.services.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/add")
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.addEmployee(employeeDto);
	}
	
	@GetMapping(value = "/all")
	public List<EmployeeDto> findAllEmployess() {
		return employeeService.findAllEmployess();
	}
	
	@GetMapping(value = "/{id}")
	public EmployeeDto findEmployee(@PathVariable(value = "id") Long id) {
		return employeeService.findEmployee(id);
	}

	@PutMapping(value = "/{id}")
	public void updateEmployee(@PathVariable(value = "id") Long id, @RequestBody EmployeeDto employeeDto) {
		employeeService.updateEmployee(id,employeeDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteEmployee(@PathVariable(value = "id") Long id) {
		employeeService.deleteEmployee(id);
	}


}
