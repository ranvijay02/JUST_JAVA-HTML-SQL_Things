package com.deloitte.service;

import com.deloitte.bean.User;
import com.deloitte.dao.LoginDao;
import com.deloitte.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {

	private LoginDao lDao;

	public LoginServiceImpl() {
		lDao = new LoginDaoImpl();
	}

	@Override
	public String getUserType(User user) {
		return lDao.getUserType(user);
	}

	@Override
	public void closeConnection() {
		lDao.closeConnection();
		
	}

	@Override
	public boolean createUser(User user) {
		return lDao.createUser(user);
	}

}
