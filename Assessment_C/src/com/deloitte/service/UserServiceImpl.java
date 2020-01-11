package com.deloitte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.bean.User;
import com.deloitte.dao.IUserDao;
import com.deloitte.exception.UserException;

@Transactional
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao userDao;
	
	@Override
	public int addUser(User user) throws UserException {
		//System.out.println("addUser : " + user);
		return userDao.addUser(user);
	}

	@Override
	public List<User> getUserList() throws UserException {
		//System.out.println("getUserList");
		return userDao.getUserList();
	}

}
