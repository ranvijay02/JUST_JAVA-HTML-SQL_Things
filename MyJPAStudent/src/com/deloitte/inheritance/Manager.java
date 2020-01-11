package com.deloitte.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_hib")
public class Manager extends Employee1 {
	private String deptName;

	@Override
	public String toString() {
		return super.toString()+", deptName=" + deptName + "]";
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
