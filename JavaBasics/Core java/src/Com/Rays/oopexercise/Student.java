package com.rays.oopexercise;


public class Student implements Richman{

	@Override
	public void donation() {
		System.out.println("Give a donation");
		
	}

	@Override
	public void party() {
		System.out.println("enjoy party ");
	
	}
	public static void main(String[] args) {
		Richman rm = new Student();
		rm.donation();
		rm.party();
	}

}
