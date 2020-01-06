package com.deloitte.dao;

import com.deloitte.bean.User;

public interface LoginDao {

	String getUserType(User user);

	void closeConnection();

	boolean createUser(User user);

}
