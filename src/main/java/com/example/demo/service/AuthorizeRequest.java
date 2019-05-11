/**
 * 
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.security.TokenService;

/**
 * @author Ashutosh Ranjan Sinh
 *
 */
@Service
public class AuthorizeRequest extends GenericService {

	@Autowired
	TokenService tokenGenerator;

	public String autorize(String authToken) {
		String ret = "Invalid Token";
		try {
			ret = tokenGenerator.validateToken(authToken);
			if (ret == null)
				ret = "Hello Token Valid";
		} catch (Exception E) {
			return ret = "Invalid Token";
		} finally {

		}
		//if (ret == null)ret = "Invalid Request";
		return ret;

	}
}
