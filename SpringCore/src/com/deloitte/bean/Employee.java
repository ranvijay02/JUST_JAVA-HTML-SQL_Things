package com.deloitte.bean;

public class Employee {
	private int id;
	private String name ;
	private long mobile;
	private Address adrress; 

	public Employee(int id, String name, long mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	public Employee(int id, String name, long mobile, Address adrress) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.adrress = adrress;
	}

	public Employee() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", adrress=" + adrress + "]";
	}
	

}

//pojo - plain old java object
// in xml everything is in inverted commas 
