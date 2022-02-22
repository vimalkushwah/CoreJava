package com.rays.oop;

public class TestPerson {

	public static void main(String[] args) {
		Person p= new Person();
		p.setadd("214 semalda ");
		System.out.println(p.getadd());
		p.setdob("02/04/1999");
		System.out.println(p.getdob());
		p.setname("Rajesh");
		System.out.println(p.getname());
		System.out.println(p.getAVG_AGE());

	}

}
