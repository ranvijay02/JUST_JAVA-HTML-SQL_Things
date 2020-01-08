package com.deloitte.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.deloitte.exception.BankingException;

public class BankingDaoTest {
	private static BankingDaoImpl bDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bDao = new BankingDaoImpl();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testDepositAmount() {
		boolean success = bDao.depositAmount(3000);
		assertTrue(success);
	}
	@Test
	public void testGetBalance() {
		double balance = bDao.getBalance();
		assertEquals(0, balance, 1);
	}
	@Test
	public void testWithdrawAmount() throws BankingException {
		boolean success = bDao.withdrawAmount(1000);
		assertTrue(success);
	}
}