package com.bricktobrick.B2BConnect.builders;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.RoleDto;
import com.bricktobrick.B2BConnect.entity.Department;
import com.bricktobrick.B2BConnect.entity.Role;
@Component
public class RoleBuilder {

	public Role updatedRole(Role existingRole, Role newRole) {
		existingRole.setDescription(newRole.getDescription());
		existingRole.setId(newRole.getId());
		existingRole.setRoleDisplayName(newRole.getRoleDisplayName());
		existingRole.setRoleName(newRole.getRoleName());

		if(newRole.getDepartment() != null) {
			existingRole.setDepartment(newRole.getDepartment());
		}
		
		return existingRole;

	}
	
	public Role convertToModel(RoleDto roleDto) {
		Role role = new Role();
		role.setDescription(roleDto.getDescription());
		role.setId(roleDto.getId());
		role.setRoleDisplayName(roleDto.getRoleDisplayName());
		role.setRoleName(roleDto.getRoleName());
		if(roleDto.getDepartment() != null) {
			if(roleDto.getDepartment().equals("Finance")) {
				role.setDepartment(Department.Finance);
			}else if(roleDto.getDepartment().equals("Marketing")) {
				role.setDepartment(Department.Marketing);
			}else if(roleDto.getDepartment().equals("Sales")) {
				role.setDepartment(Department.Sales);
			}else if(roleDto.getDepartment().equals("HR")) {
				role.setDepartment(Department.HR);
			} 
		}
		
		
		return role;

	}
	
	public RoleDto convertToDto(Role role) {
		RoleDto roleDto = new RoleDto();
		roleDto.setDescription(role.getDescription());
		roleDto.setId(role.getId());
		roleDto.setRoleDisplayName(role.getRoleDisplayName());
		roleDto.setRoleName(role.getRoleName());
		if(role.getDepartment() != null) {
			roleDto.setDepartment(role.getDepartment().name());
		}
		return roleDto;

	}
}
