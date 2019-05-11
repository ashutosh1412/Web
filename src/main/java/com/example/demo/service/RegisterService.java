/**
 * 
 */
package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dataObject.User;
import com.example.demo.repository.UserRepository;

/**
 * @author Ashutosh Ranjan Sinh
 *
 */
@Service
public class RegisterService extends GenericService{
	
	@Autowired
	UserRepository userRepository;
	PasswordEncoder passwordEncoder;
	User dbUser;
	
	public String register(User user)
	{
		if(checkUser(user)==null) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userRepository.save(user);
			this.dbUser=null;
			return "User : "+user.getName()+" Registered SuccessFully";
		}
		this.dbUser=null;
		return "User Exists";
	}
	
	private User checkUser(User user)
	{
		Optional<User> optional = userRepository.findByUsername(user.getUsername());
		optional.ifPresent(data->{
			this.dbUser = new User();
			BeanUtils.copyProperties(data, dbUser);
		});
		return dbUser;
	}
}
