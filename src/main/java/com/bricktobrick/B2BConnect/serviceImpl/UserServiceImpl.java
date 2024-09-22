package com.bricktobrick.B2BConnect.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricktobrick.B2BConnect.builders.OTPBuilder;
import com.bricktobrick.B2BConnect.builders.UserBuilder;
import com.bricktobrick.B2BConnect.common.CommonException;
import com.bricktobrick.B2BConnect.common.CommonExceptionMessage;
import com.bricktobrick.B2BConnect.dtos.UserDto;
import com.bricktobrick.B2BConnect.entity.UserAccount;
import com.bricktobrick.B2BConnect.repository.UserRepository;
import com.bricktobrick.B2BConnect.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserBuilder userBuilder;

	@Autowired
	private OTPBuilder otpBuilder;

	@Override
	public void createUser(UserDto userDto) {
		// TODO Auto-generated method stub

		UserAccount dbUserAccount = userRepository.findByUsername(userDto.getUsername());
		if(dbUserAccount != null) {
			throw CommonException.createException(CommonExceptionMessage.ALREADY_EXISTS, dbUserAccount.getUsername()+ " Username ");
		}

		UserAccount dbUserAccount1 = userRepository.findByUsernameAndMobile(userDto.getUsername(), userDto.getMobile());
		if(dbUserAccount1 != null) {
			throw CommonException.createException(CommonExceptionMessage.ALREADY_EXISTS, " Username and Mobile ");
		}
		UserAccount user = userBuilder.convertToModel(userDto);
		if (user != null) {
			userRepository.save(user);
		}

	}

	@Override
	public UserDto login(UserDto userDto) {
		UserDto userDto2 = new UserDto();

		// TODO Auto-generated method stub
		UserAccount dbUser = userRepository.findByUsernameAndMobile(userDto.getUsername(), userDto.getMobile());

		if (dbUser != null) {
			String otp = otpBuilder.generateOtp(4);
			dbUser.setOtp(otp);
			userRepository.save(dbUser);

			userDto2.setMobile(dbUser.getMobile());
			userDto2.setUsername(dbUser.getUsername());
			userDto2.setOtp(dbUser.getOtp());
			userDto2.setRole(dbUser.getRole());
			userDto2.setLoginType(dbUser.getLoginType());
			userDto2.setId(dbUser.getId());
		} else {
			throw CommonException.createException(CommonExceptionMessage.NOT_FOUND, userDto.getUsername()+" user");
		}

		return userDto2;
	}

	@Override
	public void verifyOtp(UserDto userDto) {
		// TODO Auto-generated method stub
		UserAccount dbUser = userRepository.findByUsernameAndMobileAndOtp(userDto.getUsername(), userDto.getMobile(),userDto.getOtp());
		if (dbUser == null) {
				throw CommonException.createException(CommonExceptionMessage.INVALID_OTP);

		}
//		else {
//			throw CommonException.createException(CommonExceptionMessage.NOT_FOUND, userDto.getUsername()+" user");
//		}
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	
	
}
