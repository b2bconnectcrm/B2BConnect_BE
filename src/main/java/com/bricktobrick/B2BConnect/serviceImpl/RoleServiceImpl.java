package com.bricktobrick.B2BConnect.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricktobrick.B2BConnect.builders.RoleBuilder;
import com.bricktobrick.B2BConnect.common.CommonException;
import com.bricktobrick.B2BConnect.common.CommonExceptionMessage;
import com.bricktobrick.B2BConnect.entity.Department;
import com.bricktobrick.B2BConnect.entity.Role;
import com.bricktobrick.B2BConnect.repository.RoleRepository;
import com.bricktobrick.B2BConnect.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private RoleBuilder roleBuilder;

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		if (role.getRoleName() != null) {
			Role dbRole = roleRepository.findByRoleName(role.getRoleName());
			if(dbRole != null) {
				throw CommonException.createException(CommonExceptionMessage.ALREADY_EXISTS, "Role");
			}
		}
		roleRepository.save(role);
	}

	@Override
	public List<Role> allRole() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role findRole(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public void updateRole(Long id, Role role) {
		// TODO Auto-generated method stub
		Optional<Role> dbRole = roleRepository.findById(id);
		if (dbRole.isPresent()) {
			if (dbRole.get().getId().equals(role.getId())) {
				Role updatedRole = roleBuilder.updatedRole(dbRole.get(), role);
				if (updatedRole != null) {
					roleRepository.save(updatedRole);
				}
			}
		}
	}

	@Override
	public void deleteROle(Long id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
	}

	@Override
	public List<Role> allRoleByDepartment(String department) {
		// TODO Auto-generated method stub
		Department department2=null;
		if(department.equals("Finance")) {
			department2 = (Department.Finance);
		}else if(department.equals("Marketing")) {
			department2 =(Department.Marketing);
		}else if(department.equals("Sales")) {
			department2 =(Department.Sales);
		}else if(department.equals("HR")) {
			department2 =(Department.HR);
		} 
		return roleRepository.findByDepartment(department2);
	}

}
