package com.deloitte.dao;

import java.util.List;

import com.deloitte.bean.User;
import com.deloitte.exception.UserException;

public interface IUserDao {

	int addUser(User user) throws UserException;

	List<User> getUserList() throws UserException;

}
