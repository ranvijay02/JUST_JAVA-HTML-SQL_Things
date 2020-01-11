package com.deloitte;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="stud_hib")
public class Student {
    @Id
    @SequenceGenerator(name= "seq1" , sequenceName="stud_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE , generator= "seq1")
		private int rollNo;
		private String name;
		private String subject;
		public Student() {
			
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + "]";
		}
		public Student(String name, String subject) {
			super();
			//this.rollNo = rollNo;
			this.name = name;
			this.subject = subject;
		}
		

	

}
