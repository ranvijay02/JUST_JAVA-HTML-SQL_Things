package com.deloitte.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "appointment_id")
	private int id;
	@Column(name = "doctor_id")
	private int doctor_id;
	@Column(name = "patient_name")
	private String name;
	@Column(name = "patient_gender")
	private String gender;
	private String category;
	private String bloodGroup;
	@Column(name = "patient_mobile")
	private String mobile;
	@Column(name = "app_date")
	private String date_my;
	
	public Appointment() {
	}
	

	@Pattern(regexp = "^(?:(?!Select).)*$", message = "Select a category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}




	public Appointment(int id, int doctor_id, String name, String gender, String category, String bloodGroup,
			String mobile, String date_my) {
		super();
		this.id = id;
		this.doctor_id = doctor_id;
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.bloodGroup = bloodGroup;
		this.mobile = mobile;
		this.date_my = date_my;
	}




	public String getDate_my() {
		return date_my;
	}


	public void setDate_my(String date_my) {
		this.date_my = date_my;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", doctor_id=" + doctor_id + ", name=" + name + ", gender=" + gender
				+ ", category=" + category + ", bloodGroup=" + bloodGroup + ", mobile=" + mobile + ", date_my="
				+ date_my + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@NotEmpty(message = "Blood Group is required")
	@Pattern(regexp = "^(A|B|AB|O)[-+]$", message = "Blood group must be A+,A-,B+,B-,AB+,AB-,O+ or O-")
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@NotEmpty(message = "Mobile is required")
	@Pattern(regexp = "[7-9][0-9]{9}", message = "Mobile should start with 7,8 or 9 and have 10 digits")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
