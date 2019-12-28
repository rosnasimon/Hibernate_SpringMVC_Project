package com.spring.login.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.login.dao.userDao;
import com.spring.login.model.Login;
import com.spring.login.model.User;

public class UserServiceImpl implements userService {

	@Autowired
	private userDao userdao;
	
	public void registerUser(User user) 
	{
		userdao.registerUser(user);
	}
	
	public User loginCheck(Login login)
	{
		return userdao.loginCheck(login);
	}
}
