package com.bricktobrick.B2BConnect;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bricktobrick.B2BConnect.entity.Role;
import com.bricktobrick.B2BConnect.repository.RoleRepository;
import com.bricktobrick.B2BConnect.serviceImpl.RoleServiceImpl;

@SpringBootTest
class B2BConnectApplicationTests {
	
	@Autowired
	private RoleServiceImpl roleServiceImpl;
	
	@MockBean
	private RoleRepository roleRepository;
	

	@Test
	public void allRoles() {
		when(roleRepository.findAll()).thenReturn(Stream.of(new Role(1L,"Admin","ADMIN", "ROLE", null),new Role(1L,"Super Admin","SUPERADMIN", "ROLE", null)).collect(Collectors.toList()));
	}

}
