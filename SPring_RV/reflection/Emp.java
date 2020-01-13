package com.deloitte;

public class Emp {
	private int id;
	private String name;
	private long mobile;
	private String delim = System.getProperty("line.separator");
	
	@Override
	public int hashCode() {
		System.out.println("hashcode .. " +id);
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Emp e = (Emp) obj;
		System.out.println("equals.."+id);
		return e.getName().equals(name) && e.getMobile()==mobile;
	}
	@Override
	public String toString() {
		return delim+"Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	public Emp() {
	}
	public Emp(int id, String name, long mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
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
	
}
