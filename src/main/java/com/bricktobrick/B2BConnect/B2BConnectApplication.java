package com.bricktobrick.B2BConnect;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bricktobrick.B2BConnect.entity.LoginType;
import com.bricktobrick.B2BConnect.entity.Role;
import com.bricktobrick.B2BConnect.entity.UserAccount;
import com.bricktobrick.B2BConnect.repository.RoleRepository;
import com.bricktobrick.B2BConnect.repository.UserRepository;

@SpringBootApplication
public class B2BConnectApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(B2BConnectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		List<Role> roles = roleRepository.findAll();
		if(roles.size() == 0) {
			Role role = new Role();
			role.setRoleDisplayName("ADMIN");
			role.setRoleName("Admin");
			role.setDescription("Admin");
			roleRepository.save(role);
			
			
			UserAccount user = new UserAccount();
			user.setCreatedDate(LocalDate.now());
			user.setUsername("admin");
			user.setPassword("admin");
			user.setMobile("9100004898");
			user.setRole(role);
			user.setLoginType(LoginType.WEB);
			userRepository.save(user);
		}

	}

}
