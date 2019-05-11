package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dataObject.User;
import com.example.demo.security.TokenService;
import com.example.demo.service.AuthorizeRequest;
import com.example.demo.service.LoginService;
import com.example.demo.service.RegisterService;

/**
 * @author Danger
 *
 */
@RestController
public class MyController {

	@Autowired
	TokenService tokenGenerator;
	@Autowired
	RegisterService registerService;
	@Autowired
	LoginService loginService;
	@Autowired
	AuthorizeRequest authorizeRequest;

	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String register(@RequestBody User user) {
		return registerService.register(user);
	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String login(@RequestBody User user) {
		return loginService.login(user);
	}

	@RequestMapping(value = "/Hello")
	public String Hello(@RequestHeader String authToken) {
		return authorizeRequest.autorize(authToken);
	}
}
