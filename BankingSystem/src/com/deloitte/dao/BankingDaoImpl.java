package com.deloitte.dao;

import com.deloitte.exception.BankingException;
import com.deloitte.util.BankingMessage;

public class BankingDaoImpl implements BankingDao {
	private static final double MIN_BALANCE = 1000;
	private double withdraw;
	private double balance;
	@Override
	public boolean depositAmount(double amount) {
		balance +=amount;
		return true;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public boolean withdrawAmount(double amount) throws BankingException {
		double newBal = balance - amount;
		if (newBal < MIN_BALANCE) {
			throw new BankingException(BankingMessage.INSUFFICIENT_BALANCE);
		}
		else {
			balance = newBal;
			return true;
		}
	}
	}