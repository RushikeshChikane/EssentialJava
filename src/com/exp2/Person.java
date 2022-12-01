package com.exp2;

public class Person {
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String contactNumber;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstName, String lastName, String email, String contactNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  " "+firstName+" "+lastName+" "+email+" "+contactNumber;
	}
	
	
	
	
	

}
