package com.bricktobrick.B2BConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bricktobrick.B2BConnect.entity.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>, JpaRepository<Employee, Long>{

}
