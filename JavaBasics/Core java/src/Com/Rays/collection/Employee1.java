package com.rays.collection;

import java.util.Comparator;

public class Employee1 {
	public String fname;
	public String lname;
	public int salary;
	
	public Employee1() {}
	
	public Employee1(String s, String y,int i) {
		fname = s;
		lname = y;
		salary = i;
		
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	
	}
    public String toString() {
		return fname + " " + lname + " " + salary;
	}


	}

