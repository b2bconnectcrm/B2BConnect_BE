package com.bricktobrick.B2BConnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bricktobrick.B2BConnect.entity.Department;
import com.bricktobrick.B2BConnect.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRoleName(String roleName);
	
	List<Role> findByDepartment(Department department);

}
