package com.deloitte.service;

import com.deloitte.exception.BankingException;

public interface BankingService {

	boolean depositAmount(double amount);

	double getBalance();

	boolean withdrawAmount(double amount) throws BankingException;

}
