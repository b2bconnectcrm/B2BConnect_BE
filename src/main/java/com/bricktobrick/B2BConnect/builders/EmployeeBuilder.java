package com.bricktobrick.B2BConnect.builders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.EmployeeDto;
import com.bricktobrick.B2BConnect.dtos.UserDto;
import com.bricktobrick.B2BConnect.entity.Employee;
import com.bricktobrick.B2BConnect.entity.LoginType;
import com.bricktobrick.B2BConnect.entity.UserAccount;

@Component
public class EmployeeBuilder {

	@Autowired
	private RoleBuilder roleBuilder;
	
	public Employee convertToemployeeModel(EmployeeDto employeeDto) {

		Employee employee = new Employee();
		employee.setAddress(employeeDto.getAddress());
		employee.setAadharFilePath(employeeDto.getAadharFilePath());
		employee.setAadharNumber(employeeDto.getAadharNumber());
		employee.setDepartment(employeeDto.getDepartment());
		employee.setId(employeeDto.getId());
		employee.setEmail(employeeDto.getEmail());
		employee.setMobile(employeeDto.getMobile());

	
		employee.setName(employeeDto.getName());
		employee.setPancardFilePath(employeeDto.getPancardFilePath());
		employee.setPancardNumber(employeeDto.getPancardNumber());
		if(employeeDto.getRole() != null) {
			employee.setRole(roleBuilder.convertToModel(employeeDto.getRole()));
		}
		
		employee.setUsername(employeeDto.getUsername());
		
		//employee.setUserAccount(employeeDto.getUserAccount());
		return employee;
	}

	public EmployeeDto convertToemployeeDto(Employee employee) {

		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setAddress(employee.getAddress());
		employeeDto.setAadharFilePath(employee.getAadharFilePath());
		employeeDto.setAadharNumber(employee.getAadharNumber());
		employeeDto.setDepartment(employee.getDepartment());
		employeeDto.setId(employee.getId());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setMobile(employee.getMobile());

	
		employeeDto.setName(employee.getName());
		employeeDto.setPancardFilePath(employee.getPancardFilePath());
		employeeDto.setPancardNumber(employee.getPancardNumber());
		if(employee.getRole() != null) {
			employeeDto.setRole(roleBuilder.convertToDto(employee.getRole()));
		}
		employeeDto.setUsername(employee.getUsername());
		//employeeDto.setUserAccount(employee.getUserAccount());

		return employeeDto;
	}

	public List<EmployeeDto> convertToListModel(List<Employee> employees) {

		List<EmployeeDto> employeeDtos = new ArrayList<>();
		if (employees != null && employees.size() > 0) {
			employees.forEach(employee -> {
				employeeDtos.add(convertToemployeeDto(employee));
			});
		}
		return employeeDtos;

	}

	public EmployeeDto convertModelToDto(Employee employee, EmployeeDto employeeDto) {

		employeeDto.setAddress(employee.getAddress());
		employeeDto.setAadharFilePath(employee.getAadharFilePath());
		employeeDto.setAadharNumber(employee.getAadharNumber());
		employeeDto.setDepartment(employee.getDepartment());
		employeeDto.setId(employee.getId());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setMobile(employee.getMobile());

	
		employeeDto.setName(employee.getName());
		employeeDto.setPancardFilePath(employee.getPancardFilePath());
		employeeDto.setPancardNumber(employee.getPancardNumber());
		if(employee.getRole() != null) {
		employeeDto.setRole(roleBuilder.convertToDto(employee.getRole()));
		}
		employeeDto.setUsername(employee.getUsername());
		//employeeDto.setUserAccount(employee.getUserAccount());
		return employeeDto;
	}

	public Employee convertDtoToModel(Employee employee, EmployeeDto employeeDto) {

		employee.setAddress(employeeDto.getAddress());
		employee.setAadharFilePath(employeeDto.getAadharFilePath());
		employee.setAadharNumber(employeeDto.getAadharNumber());
		employee.setDepartment(employeeDto.getDepartment());
		employee.setId(employeeDto.getId());
		employee.setEmail(employeeDto.getEmail());
		employee.setMobile(employeeDto.getMobile());

	
		employee.setName(employeeDto.getName());
		employee.setPancardFilePath(employeeDto.getPancardFilePath());
		employee.setPancardNumber(employeeDto.getPancardNumber());
		if(employeeDto.getRole() != null) {
			employee.setRole(roleBuilder.convertToModel(employeeDto.getRole()));
		}
		employee.setUsername(employeeDto.getUsername());
		//employee.setUserAccount(employeeDto.getUserAccount());
		return employee;
	}
	
	
	public UserAccount creatUserAccountForEmployee(EmployeeDto employeeDto) {
		
		UserAccount userAccount = new UserAccount();
		userAccount.setCreatedDate(LocalDate.now());
		userAccount.setLoginType(LoginType.WEB);
		userAccount.setMobile(employeeDto.getMobile());
		userAccount.setUsername(employeeDto.getUsername());
		userAccount.setRole(roleBuilder.convertToModel(employeeDto.getRole()));
		return userAccount;

		
	}
	

}
