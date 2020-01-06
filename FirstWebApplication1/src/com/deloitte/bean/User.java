package com.deloitte.bean;

public class User {
	private String login;
	private String password;
	private String type;

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", type=" + type + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User(String login, String password, String type) {
		super();
		this.login = login;
		this.password = password;
		this.type = type;
	}

	public User() {
	
	}

}
