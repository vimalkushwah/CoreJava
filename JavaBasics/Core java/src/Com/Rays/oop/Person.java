package com.rays.oop;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name =null;
	Date d =new Date();
	
	SimpleDateFormat Format= new SimpleDateFormat("dd/MM/yy");
   String dob=Format.format(d);
	private String add=null;
	private int age=00;
	public static final int AVG_AGE=50;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getdob() {
		return dob;
	}
	public void setdob(String dob) {
		this.dob=dob;
	}
	public String getadd() {
		return add;
	}
	public void setadd(String add) {
		this.add=add;
		
	}
	public static int getAVG_AGE() {
		return AVG_AGE;
	}
	

}
