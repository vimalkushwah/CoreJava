package com.rays.oop;

public class Person1 {
	protected String firstname;
	protected String lastname;
	protected String address;
	public Person1(){
		System.out.println("person defoult constructor");
		
	}
	public Person1(String fn,String ln){
		this();
		System.out.println("2 parameter constructor");
		
	}
	public Person1(String fn,String ln,String add){
		this(fn,ln);
	    address=add;
		System.out.println("3 parameter constructor");
	}
	public static void main(String[] args) {
		Person1 p=new Person1("ram","kumar");
		
	}
	}
