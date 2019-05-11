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
import com.example.demo.security.TokenService;

/**
 * @author Danger
 *
 */
@Service
public class LoginService extends GenericService {

	@Autowired
	TokenService tokenGenerator;
	UserRepository userRepository;
	PasswordEncoder passwordEncoder;
	User dbUser;

	public String login(User user) {
		if (checkUser(user) != null) {
			if (passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {
				this.dbUser = null;
				return tokenGenerator.createToken(user);
			} else {
				this.dbUser = null;
				return "Invaid Password";
			}
		} else {
			this.dbUser = null;
			return "Invalid User Name";
		}
	}

	private User checkUser(User user) {
		try{Optional<User> optional = userRepository.findByUsername(user.getUsername());
		optional.ifPresent(data -> {
			this.dbUser = new User();
			BeanUtils.copyProperties(data, dbUser);
		});}
		catch(Exception e)
		{
			this.dbUser=null;
			System.out.println(e.getMessage());
		}
		return dbUser;
	}
}
