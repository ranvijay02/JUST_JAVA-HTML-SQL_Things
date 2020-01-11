package com.deloitte.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.deloitte.bean.Appointment;
import com.deloitte.bean.Doctor;
import com.deloitte.service.IDoctorService;

@Controller
public class DoctorController {
	@Autowired
	IDoctorService dService = null;
	List<String> catList = null; // Category List

	List<Doctor> alist;
	List<Appointment> dList;

//	public DoctorController() {
//	dService = new DoctorService();
//	}

	@RequestMapping(value = "/registerDoctor.obj")
	public String redirectToAddDoctor(Model model) {
		Doctor doctor = new Doctor();
		catList = dService.getCategory();
		model.addAttribute("clist", catList);
		model.addAttribute("doctor", doctor);
		return "doctorForm";
	}

	@RequestMapping(value = "/bookAppointment")
	public String redirectToAddAppointment(Model model) {
		Appointment appointment = new Appointment();
		System.out.println(appointment);
		catList = dService.getCategory();
		model.addAttribute("clist", catList);
		model.addAttribute("appointment", appointment);
		return "appointmentForm";
	}

	@RequestMapping(value = "/getAppointment")
	public String redirectToSelectAppointment(@ModelAttribute(value = "appointment") @Valid Appointment appointment,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			catList = dService.getCategory();
			model.addAttribute("clist", catList);
			return "appointmentForm";
		} else {
			System.out.println("In Get Appointment " + appointment);
			int output = dService.addAppointment(appointment);
			model.addAttribute("patientName", appointment.getName());
			model.addAttribute("patientId", appointment.getId());
			model.addAttribute("date", appointment.getDate_my());
			alist = dService.getDoctorList(appointment.getCategory());
			model.addAttribute("elist", alist);

			return "showDoctorsAndBookAppointment";
		}
	}

	@RequestMapping(value = "/setDoctorId")
	public String setDoctorId(@RequestParam("doctor_id") String doctor_id,
			@RequestParam("patient_id") String patient_id, @RequestParam("date") String date, Model model) {
		int output = dService.addDoctorId(doctor_id, patient_id);
		int doc_id = Integer.parseInt(doctor_id);
		Doctor doctor = dService.getDoctorList(doc_id);
		if (output != 0) {
			System.out.println("value updated");
			model.addAttribute("doctorName", doctor.getName());
			model.addAttribute("sTime", doctor.getsTime());
			model.addAttribute("eTime", doctor.geteTime());
			model.addAttribute("date", date);
			return "appointmentBooked";
		}
		return "error";
	}

	@RequestMapping(value = "/checkAppointments")
	public String redirectToAllAppointments(Model model) {
		dList = dService.getAppointmentList();
		model.addAttribute("elist", dList);
		return "showAppointments";
	}

	@RequestMapping(value = "/submitDoctor")
	public String addAthlete(@ModelAttribute(value = "doctor") @Valid Doctor doctor, BindingResult bindingResult,
			Model model) {
		// System.out.println(athlete);
		if (bindingResult.hasErrors()) {
			catList = dService.getCategory();
			model.addAttribute("clist", catList);
			return "doctorForm";
		} else {
			int output = dService.addDoctor(doctor);
			model.addAttribute("athleteId", doctor.getId());
			if (output == 1) {
				return "successAdd";
			} else {
				return "athleteAdded";
			}
		}
	}

	@RequestMapping(value = "/checkAdmin")
	public String redirectToAdminHome(@RequestParam("pin") String pin, Model model) {
		System.out.println(pin);
		if (pin.equals("1234"))
			return "admin";
		else {
			return "loginFailed";
		}
	}

	@RequestMapping(value = "/allDoctors")
	public String redirectToAllDoctors(Model model) {
		alist = dService.getDoctorList();
		model.addAttribute("elist", alist);

		return "showAvailableDoctors";
	}

}