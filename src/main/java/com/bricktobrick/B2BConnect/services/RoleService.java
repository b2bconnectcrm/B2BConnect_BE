package com.bricktobrick.B2BConnect.services;

import java.util.List;

import com.bricktobrick.B2BConnect.entity.Role;

public interface RoleService {

	void addRole(Role role);

	List<Role> allRole();

	Role findRole(Long id);

	void updateRole(Long id, Role role);

	void deleteROle(Long id);

	List<Role> allRoleByDepartment(String department);

}
