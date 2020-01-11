package com.deloitte.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctor_id")
	private int id;
	@Column(name="doctor_name")
	private String name;
	@Column(name="doctor_gender")
	private String gender;
	private String category;
	@Column(name="doctor_email")
	private String email;
	@Column(name="doctor_mobile")
	private String mobile;
	private String sTime;
	private String eTime;

	public Doctor() {
	}

	

	public Doctor(int id, String name, String gender, String category, String email, String mobile, String sTime,
			String eTime) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.email = email;
		this.mobile = mobile;
		this.sTime = sTime;
		this.eTime = eTime;
	}


	@Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$", 
			   message="Please enter in format xx:xx 24 Hour Format")
	public String getsTime() {
		return sTime;
	}



	public void setsTime(String sTime) {
		this.sTime = sTime;
	}


	@Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$", 
			   message="Please enter in format xx:xx 24 Hour Format")
	public String geteTime() {
		return eTime;
	}



	public void seteTime(String eTime) {
		this.eTime = eTime;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message="Doctor Name is required")
	@Pattern(regexp="^[A-Z][A-Za-z]{2,40}$", 
	   message="Doctor name should have only characters and first letter should be uppercase")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotEmpty(message="Gender not selected")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Pattern(regexp = "^(?:(?!Select).)*$",
			message="Select a category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@NotEmpty(message="Doctor Email is required")	
	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
			message="email is not in proper format")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", gender=" + gender + ", category=" + category + ", email="
				+ email + ", mobile=" + mobile + ", sTime=" + sTime + ", eTime=" + eTime + "]";
	}



	@NotEmpty(message="Mobile is required")
	@Pattern(regexp = "[7-9][0-9]{9}",
		message="Mobile should start with 7,8 or 9 and have 10 digits")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
