package com.deloitte.bean;

public class Address {
	private int houseno;
	private String street ;
	private String city;
	private String state;
	
	public Address() {
		
	}
	public Address(int houseno, String street, String city, String state) {
		
		this.houseno = houseno;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
