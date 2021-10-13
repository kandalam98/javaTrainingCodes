package com.casestudy.demo;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private int phoneNumber;
	private LocalDate birthday;
	private LocalDate anniversary;
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + ", anniversary=" + anniversary
				+ "]";
	}
	public Employee(String firstName, String lastName, String address, String email, int phoneNumber, LocalDate birthday,
			LocalDate anniversary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.anniversary = anniversary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public LocalDate getAnniversary() {
		return anniversary;
	}
	public void setAnniversary(LocalDate anniversary) {
		this.anniversary = anniversary;
	}

	

}
