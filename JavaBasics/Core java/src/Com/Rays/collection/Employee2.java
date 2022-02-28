package com.rays.collection;

import java.util.Comparator;

public class Employee2 {
	private String fName;
	private String lName;
	
	public  Employee2 () {}
	public  Employee2 (String fn,String ln) {
		fName=fn;
		lName=ln;
		
		
		}
	public String getfName() {
		return fName;
	}
	
	
	public String getlName() {
		return lName;
	}
	public String toString() {
		return fName + " " + lName;
	}

	


}





