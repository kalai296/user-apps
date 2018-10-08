package com.users.springbootangularusers;

public class User {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;

	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfirstName() {
		return this.firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

}
