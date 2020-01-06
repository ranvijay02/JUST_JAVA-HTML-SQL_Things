package com.deloitte.service;

import com.deloitte.bean.User;

public interface LoginService {

	String getUserType(User user);

	void closeConnection();

	boolean createUser(User user);

}
