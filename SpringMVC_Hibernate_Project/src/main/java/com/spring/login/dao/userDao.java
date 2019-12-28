package com.spring.login.dao;

import com.spring.login.model.Login;
import com.spring.login.model.User;

public interface userDao {

	public void registerUser(User user);
	public User loginCheck(Login login);

}
