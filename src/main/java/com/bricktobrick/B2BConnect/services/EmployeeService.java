package com.bricktobrick.B2BConnect.services;

import java.util.List;

import com.bricktobrick.B2BConnect.dtos.EmployeeDto;

public interface EmployeeService {

	void addEmployee(EmployeeDto employeeDto);

	List<EmployeeDto> findAllEmployess();

	EmployeeDto findEmployee(Long id);

	void updateEmployee(Long id, EmployeeDto employeeDto);

	void deleteEmployee(Long id);

}
