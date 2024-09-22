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

import com.bricktobrick.B2BConnect.entity.Role;
import com.bricktobrick.B2BConnect.services.RoleService;

@RestController
@RequestMapping(value = "/role")
@CrossOrigin
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping(value = "/add")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
	
	@GetMapping(value = "/all")
	public List<Role> allRole() {
		return roleService.allRole();
	}
	
	@GetMapping(value = "/all/{department}")
	public List<Role> allRoleByDepartment(@PathVariable(value = "department") String department) {
		return roleService.allRoleByDepartment(department);
	}
	
	@GetMapping(value = "/{id}")
	public Role findRole(@PathVariable(value = "id") Long id) {
		return roleService.findRole(id);
	}

	@PutMapping(value = "/{id}")
	public void updateRole(@PathVariable(value = "id") Long id, @RequestBody Role role) {
		 roleService.updateRole(id, role);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteROle(@PathVariable(value = "id") Long id) {
		 roleService.deleteROle(id);
	}

}
