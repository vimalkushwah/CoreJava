package com.rays.oopexercise;

public class BusinessMan implements Richman {

	@Override
	public void donation() {
		System.out.println(" get donation");
		
	}

	@Override
	public void party() {
		System.out.println(" give a party");
		
	}
	public static void main(String[] args) {
		Richman rm= new BusinessMan();
		rm.donation();
		rm.party();
	}

}
