package com.deloitte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.deloitte.bean.Athlete;
import com.deloitte.exception.AthleteException;

@Transactional
@Repository
public class AthleteDao implements IAthleteDao {

	@PersistenceContext
	EntityManager entityManager;
	Logger logger = Logger.getLogger(AthleteDao.class);
	
	@Override
	public int addAthlete(Athlete athlete) throws AthleteException {
		System.out.println("DAO : "+athlete);
		try{
		   entityManager.persist(athlete);
		   logger.info("Saved Athlete : " + athlete.getName());
		}
		catch(Exception e){
			e.printStackTrace();
			logger.error("Error in inserting data "+e);
			throw new AthleteException("Error in inserting data ");
		}
		return 1;
	}

	@Override
	public List<Athlete> getAthleteList() throws AthleteException {
		String sql = "SELECT list from Athlete list";
		try{
		TypedQuery<Athlete> query = entityManager.createQuery(sql, Athlete.class);
		   logger.info("Fetching Athletes  ");
		return query.getResultList();
		}
		catch(Exception e){
			//e.printStackTrace();
			logger.error("Error in fetching data "+e);
			throw new AthleteException("Error in fetching data ");
		}
	}

	@Override
	public List<String> getCategory() throws AthleteException {
		//System.out.println("getCategory");
		TypedQuery<String> query=null;
		try{
		String sql = "SELECT cat.category from Category cat";
		query = entityManager.createQuery(sql, String.class);
		   logger.info("Fetching categories " );
			return query.getResultList();
		}
		catch(Exception e){
			e.printStackTrace();
			logger.error("Error in loading category "+e);
			throw new AthleteException("Error in loading category ");
		}
       /* List<String> aList = new ArrayList<>();
		aList.add("Running");
		aList.add("High Jump");
		aList.add("Hurdles");
		aList.add("Relay");
		aList.add("Javelin Throw");
		aList.add("Shot put");		
		return aList;*/
	}

}
