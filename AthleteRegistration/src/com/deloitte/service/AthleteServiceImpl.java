package com.deloitte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.bean.Athlete;
import com.deloitte.dao.IAthleteDao;
import com.deloitte.exception.AthleteException;

@Transactional
@Service
public class AthleteServiceImpl implements IAthleteService{

	@Autowired
	IAthleteDao athleteDao;
	
	@Override
	public int addAthlete(Athlete athlete) throws AthleteException {
		//System.out.println("addAthlete : " + athlete);
		return athleteDao.addAthlete(athlete);
	}

	@Override
	public List<Athlete> getAthleteList() throws AthleteException {
		//System.out.println("getAthleteList");
		return athleteDao.getAthleteList();
	}

	@Override
	public List<String> getCategory() throws AthleteException {
		//System.out.println("getCategory");
		return athleteDao.getCategory();		
	}

}
