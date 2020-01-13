package com.deloitte.bean;


public class Employee {
	private int id;
	private String name;
	private long mobile;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, long mobile, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	public Employee() {
		System.out.println("def constr called");
	}
	public Employee(int id, String name, long mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setId() called..");
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
	
}
