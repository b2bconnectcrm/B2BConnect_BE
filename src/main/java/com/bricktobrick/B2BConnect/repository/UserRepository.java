package com.bricktobrick.B2BConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bricktobrick.B2BConnect.entity.UserAccount;

@Repository
public interface UserRepository extends JpaRepository<UserAccount, Long> {

	UserAccount findByUsernameAndMobile(String username, String mobile);
	
	UserAccount findByUsernameAndPassword(String username, String password);
	
	UserAccount findByUsername(String username);
	
	UserAccount findByUsernameAndMobileAndOtp(String username, String mobile, String otp);

}
