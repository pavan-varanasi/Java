package com.java.unit1;

import java.util.Date;

public class Account {
	private int accNo;
	private String accType;
	private String firstName;
	private String lastName;
	private Date dob;
	
	public Account(int accNo, String accType, String firstName,
			String lastName, Date dob) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String toString() {
		return "\nAccount [accNo=" + accNo + ", accType=" + accType
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + "]";
	}
}


