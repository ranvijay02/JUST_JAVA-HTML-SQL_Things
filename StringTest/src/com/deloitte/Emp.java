package com.deloitte;

public class Emp {
private int id;
private String name;
private long mobile;

public Emp() {
	
}

@Override
public boolean equals(Object obj) {
	Emp comparedEmp = (Emp) obj;
	return comparedEmp.getId() == id &&
			comparedEmp.getMobile() == mobile &&
			comparedEmp.getName().equals(name);
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
public Emp(int id, String name, long mobile) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
}

}
