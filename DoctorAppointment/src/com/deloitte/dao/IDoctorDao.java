package com.deloitte.dao;

import java.util.List;

import com.deloitte.bean.Appointment;
import com.deloitte.bean.Doctor;

public interface IDoctorDao {

	List<String> getCategory();

	int addDoctor(Doctor doctor);

	List<Doctor> getDoctorList();

	int addAppointment(Appointment appointment);

	List<Doctor> getDoctorList(String category);

	int addDoctorId(String doctor_id, String patient_id);

	List<Appointment> getAppointmentList();

	Doctor getDoctorList(int doc_id);

}