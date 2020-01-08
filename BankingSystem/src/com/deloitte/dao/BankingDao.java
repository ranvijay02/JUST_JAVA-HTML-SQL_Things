package com.deloitte.dao;

import com.deloitte.exception.BankingException;

public interface BankingDao {

	boolean depositAmount(double amount);

	double getBalance();

	boolean withdrawAmount(double amount) throws BankingException;
}