package com.bricktobrick.B2BConnect.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricktobrick.B2BConnect.builders.EmployeeBuilder;
import com.bricktobrick.B2BConnect.dtos.EmployeeDto;
import com.bricktobrick.B2BConnect.entity.Employee;
import com.bricktobrick.B2BConnect.entity.UserAccount;
import com.bricktobrick.B2BConnect.repository.EmployeeRepository;
import com.bricktobrick.B2BConnect.repository.UserRepository;
import com.bricktobrick.B2BConnect.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeBuilder employeeBuilder;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = employeeBuilder.convertToemployeeModel(employeeDto);

		UserAccount userAccount = employeeBuilder.creatUserAccountForEmployee(employeeDto);
		if (userAccount != null) {
			UserAccount dbUserAccount = userRepository.findByUsernameAndMobile(userAccount.getUsername(),
					userAccount.getMobile());
			if (dbUserAccount != null) {
				throw new RuntimeException("UserAccount Already Exists!");
			}
		}

		if (employee != null) {
			employee.setUserAccount(userAccount);
			employeeRepository.save(employee);
		}

	}

	@Override
	public List<EmployeeDto> findAllEmployess() {
		// TODO Auto-generated method stub
		List<Employee> employees = employeeRepository.findAll();

		List<EmployeeDto> employeeDtos = employeeBuilder.convertToListModel(employees);
		return employeeDtos;
	}

	@Override
	public EmployeeDto findEmployee(Long id) {
		// TODO Auto-generated method stub
		EmployeeDto dbEmployee = null;
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		if (optionalEmployee.isPresent()) {
			dbEmployee = employeeBuilder.convertToemployeeDto(optionalEmployee.get());
		}
		return dbEmployee;
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public void updateEmployee(Long id, EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee dbEmployee = employeeRepository.findById(id).get();
		if (dbEmployee != null) {
			if (dbEmployee.getId().equals(employeeDto.getId())) {
				Employee employee = employeeBuilder.convertDtoToModel(dbEmployee, employeeDto);
				employeeRepository.save(employee);
			}
		}
	}

}
