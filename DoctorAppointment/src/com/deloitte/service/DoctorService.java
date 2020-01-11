package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.bean.Appointment;
import com.deloitte.bean.Doctor;
import com.deloitte.dao.IDoctorDao;

@Service
public class DoctorService implements IDoctorService {
	@Autowired
	IDoctorDao dDao = null;
//	public DoctorService() {
//	dDao = new DoctorDao();
//	}
	
	@Override
	public List<String> getCategory() {
		return dDao.getCategory();
	}

	@Override
	public int addDoctor(Doctor doctor) {
		return dDao.addDoctor(doctor);
	}

	@Override
	public List<Doctor> getDoctorList() {
		return dDao.getDoctorList();
	}

	@Override
	public int addAppointment(Appointment appointment) {
		return dDao.addAppointment(appointment);
	}

	@Override
	public List<Doctor> getDoctorList(String category) {
		return dDao.getDoctorList(category);
	}

	@Override
	public int addDoctorId(String doctor_id, String patient_id) {
		return dDao.addDoctorId(doctor_id, patient_id);
	}

	@Override
	public List<Appointment> getAppointmentList() {
		return dDao.getAppointmentList();
	}

	@Override
	public Doctor getDoctorList(int doc_id) {
		return dDao.getDoctorList(doc_id);
	}
}