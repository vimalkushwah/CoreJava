package com.rays.oopexercise;

public class Person2 {
	protected String firstName;
	protected String lastName;
	public Person2() {}
	public Person2(String fn,String ln) {
		firstName=fn;
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return this.firstName+this.lastName;
	}
	}
