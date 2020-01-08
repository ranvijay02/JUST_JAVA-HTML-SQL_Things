package com.deloitte.service;

import com.deloitte.dao.BankingDao;
import com.deloitte.dao.BankingDaoImpl;
import com.deloitte.exception.BankingException;

public class BankingServiceImpl implements BankingService {
	private BankingDao bDao; 
	public BankingServiceImpl() {
		bDao = new BankingDaoImpl();
	}
	@Override
	public boolean depositAmount(double amount) {
		return bDao.depositAmount(amount);
	}
	@Override
	public double getBalance() {
		return bDao.getBalance();
	}
	@Override
	public boolean withdrawAmount(double amount) throws BankingException {
		return bDao.withdrawAmount(amount);
	}
}