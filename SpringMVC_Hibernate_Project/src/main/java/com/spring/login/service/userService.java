package com.spring.login.service;

import com.spring.login.model.Login;
import com.spring.login.model.User;

public interface userService {

	public void registerUser(User user);
	public User loginCheck(Login login);

}
