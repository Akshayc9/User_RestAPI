package com.spboot.main.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {

	@JsonProperty
	private String username;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	private String cnfPassword;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", cnfPassword=" + cnfPassword + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfPassword() {
		return cnfPassword;
	}

	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}

	public Login(String username, String password, String cnfPassword) {
		super();
		this.username = username;
		this.password = password;
		this.cnfPassword = cnfPassword;
	}
	
	
	
}
