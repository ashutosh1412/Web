/**
 * 
 */
package com.example.demo.security;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
/**
 * @author Danger
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dataObject.Token;
import com.example.demo.dataObject.User;
import com.example.demo.repository.TokenRepository;
import com.example.demo.service.GenericService;

@Service
public class TokenService extends GenericService{

	@Autowired
	EncryptDecryptService encryptDecrypt;
	TokenRepository tokenRepository;
	Token dbToken;

	public String createToken(User user) {
		Token token = new Token();
		BeanUtils.copyProperties(user, token);
		token.setExpires(Long.toString(System.currentTimeMillis() + 1000 *60));
		tokenRepository.save(token);
		return encryptDecrypt.encrypt(token.toString());
	}

	public String validateToken(String authToken) {
		String ret = null;
		try {
			Token token = new Token();
			token.setPropertiesFromString(encryptDecrypt.decrypt(authToken));
			long expires = Long.parseLong(token.getExpires());
			Optional<Token> optional = tokenRepository.findById(token.getId());
			optional.ifPresent(data->{
				dbToken = new Token();
				BeanUtils.copyProperties(data, dbToken);
			});
			
			if (dbToken==null)
			{
				ret = "Invalid Token";
			}
			else if(!dbToken.getUsername().equals(token.getUsername())) {
				ret = "Invalid User";
			}
			else if (expires >= System.currentTimeMillis())
			{
				ret = "Token Expired";
			}
		} catch (Exception e) {
			ret = "Invalid Token";
			System.out.println(e.getMessage());
		}
		return ret;
	}
}