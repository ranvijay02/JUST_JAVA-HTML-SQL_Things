package com.deloitte.dao;

import java.util.List;

import com.deloitte.bean.Athlete;
import com.deloitte.exception.AthleteException;

public interface IAthleteDao {

	int addAthlete(Athlete athlete) throws AthleteException;

	List<Athlete> getAthleteList() throws AthleteException;

	List<String> getCategory() throws AthleteException;

}
