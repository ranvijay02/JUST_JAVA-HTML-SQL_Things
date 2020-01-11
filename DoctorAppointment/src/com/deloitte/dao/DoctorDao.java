package com.deloitte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.deloitte.bean.Appointment;
import com.deloitte.bean.Doctor;

@Transactional
@Repository
public class DoctorDao implements IDoctorDao {

	@PersistenceContext
	EntityManager entityManager;
	Logger logger = Logger.getLogger(DoctorDao.class);
	

	@Override
	public List<String> getCategory() {
		TypedQuery<String> query = null;// HQL
		String hql = "SELECT c.category from Category c";
		if (entityManager == null) {
			System.out.println("Null is returned");
			return null;
		} else {

			query = entityManager.createQuery(hql, String.class);
			logger.info("Fetching categories ");
			return query.getResultList();
		}
	}

	@Override
	public int addDoctor(Doctor doctor) {
		System.out.println("DAO : " + doctor);
		entityManager.persist(doctor);
		logger.info("Saved Doctor : " + doctor.getName());
		return 1;
	}

	@Override
	public List<Doctor> getDoctorList() {
		String sql = "SELECT list from Doctor list";
		TypedQuery<Doctor> query = entityManager.createQuery(sql, Doctor.class);
		   logger.info("Fetching Athletes  ");
		return query.getResultList();
	}


	@Override
	public List<Doctor> getDoctorList(String category) {
		String sql = "SELECT list from Doctor list where category= :category";
		TypedQuery<Doctor> query = entityManager.createQuery(sql, Doctor.class);
		query.setParameter("category", category);
		   logger.info("Fetching Doctors  ");
		return query.getResultList();
	}


	@Override
	public int addAppointment(Appointment appointment) {
		System.out.println("DAO : " + appointment);
		entityManager.persist(appointment);
		logger.info("Saved Appointment : " + appointment.getName());
		System.out.println("Added");
		return 1;
	}

	@Override
	public int addDoctorId(String doctor_id, String patient_id) {
		int p_id = Integer.parseInt(patient_id);
		Appointment apt = entityManager.find(Appointment.class, p_id);
		apt.setDoctor_id(Integer.parseInt(doctor_id));
		Appointment aptDb = entityManager.merge(apt);
		if(aptDb == null) {
			return 0;
		}
		return 1;
	}

	@Override
	public List<Appointment> getAppointmentList() {
		String sql = "SELECT list from Appointment list";
		System.out.println("Called Function");
		TypedQuery<Appointment> query = entityManager.createQuery(sql, Appointment.class);
		   logger.info("Fetching Appointments");
		return query.getResultList();
	}

	@Override
	public Doctor getDoctorList(int doc_id) {
		Doctor doctor = entityManager.find(Doctor.class, doc_id);
		return doctor;
	}
}