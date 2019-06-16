package com.retail.onlinestoreapi.pojo;

public class Customer {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String customerId;
	private String password;

	public Customer() {
	}

	public Customer(String firstName, String lastName, String mobileNumber, String userId, String userPassword) {
		this(userId, userPassword);
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public Customer(String userId, String userPassword) {
		this.customerId = userId;
		this.password = userPassword;
	}

	public Customer(String userId) {
		this.customerId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return firstName+","+lastName+","+mobileNumber+","+customerId+","+password;
	}
}
