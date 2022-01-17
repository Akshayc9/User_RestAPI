package com.spboot.main.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "USER_TABLE")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Long empId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMPLOYEE_AGE")
	private Integer empAge;
	
	@Column(name = "EMPLOYEE_EMAIL", updatable = false, unique = true)
	private String empMail;
	
	@Column(name = "EMPLOYEE_GENDER", updatable = false)
	private String empGender;
	
	@Column(name = "EMPLOYEE_ADDRESS")
	private String empAddress;
	
	@Column(name = "EMPLOYEE_MOBILE")
	private String empMobile;
	
	@Column(name = "EMPLOYEE_PASSWORD", updatable = false)
	private String password;
	
	@Column(name = "EMPLOYEE_CNFPASSWORD", updatable = false)
	private String confirmPassword;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	@Column(name = "EMPLOYEE_ROLE")
	private String empRole;
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", empAge=" + empAge + ", empMail=" + empMail
				+ ", empGender=" + empGender + ", empAddress=" + empAddress + ", empMobile=" + empMobile + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", empRole=" + empRole + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public User(String firstName, String lastName, Integer empAge, String empMail, String empGender, String empAddress,
			String empMobile, String password, String confirmPassword, String empRole) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empAge = empAge;
		this.empMail = empMail;
		this.empGender = empGender;
		this.empAddress = empAddress;
		this.empMobile = empMobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.empRole = empRole;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
