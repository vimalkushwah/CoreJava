package com.rays.oop;

public class Person1Super extends Person1 {
	private String Designation =null;
	public Person1Super() {
		System.out.println("default constructor");
	}
	public Person1Super(String fn,String ln) {
		super();
		System.out.println("2 parameter constructor");
	}
	public Person1Super(String fn,String ln,String add) {
		super(fn,ln);
		System.out.println("3 parameter constructor ");
	}
	
	
	
	public static void main(String[] args) {
		Person1Super p1=new Person1Super("fh","hj","rt");
		
	}

}
