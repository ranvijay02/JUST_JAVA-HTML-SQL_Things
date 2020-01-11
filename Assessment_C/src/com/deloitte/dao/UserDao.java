package com.deloitte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.deloitte.bean.User;
import com.deloitte.exception.UserException;

@Transactional
@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	EntityManager entityManager;
	Logger logger = Logger.getLogger(UserDao.class);
	
	@Override
	public int addUser(User user) throws UserException {
		System.out.println("DAO : "+user);
		try{
		   entityManager.persist(user);
		   logger.info("Saved User : " + user.getName());
		}
		catch(Exception e){
			e.printStackTrace();
			logger.error("Error in inserting data "+e);
			throw new UserException("Error in inserting data ");
		}
		return 1;
	}

	@Override
	public List<User> getUserList() throws UserException {
		String sql = "SELECT list from User list";
		try{
		TypedQuery<User> query = entityManager.createQuery(sql, User.class);
		   logger.info("Fetching Users  ");
		return query.getResultList();
		}
		catch(Exception e){
			//e.printStackTrace();
			logger.error("Error in fetching data "+e);
			throw new UserException("Error in fetching data ");
		}
	}

}
