package com.deloitte.service;

import java.util.List;

import com.deloitte.bean.User;
import com.deloitte.exception.UserException;

public interface IUserService {


	int addUser(User user) throws UserException;

	List<User> getUserList() throws UserException;
}
